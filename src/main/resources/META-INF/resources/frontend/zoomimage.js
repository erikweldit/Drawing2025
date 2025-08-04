window.customElements.whenDefined('vaadin-app-layout').then(() => {
    const svg = document.getElementById('svgCanvas');
    const zoomGroup = document.getElementById('zoomGroup');

    let firstClick = null, secondClick = null, thirdClick = null;
    console.log("zoomimage er loaed på ny");
    if (svg && zoomGroup) {
        console.log("svg er loaed");
        console.log("zoomGroup er loaed");
        svg.addEventListener('mousedown', handleMouseDown);

        function getMousePosition(event) {
            let svgRect = svg.getBoundingClientRect();
            return {
                x: event.clientX - svgRect.left,
                y: event.clientY - svgRect.top
            };
        }

        function handleMouseDown(event) {
            const pos = getMousePosition(event);

            if (!firstClick) {
                firstClick = pos;
                drawCircle(firstClick);
            } else if (!secondClick) {
                secondClick = pos;
                drawCircle(secondClick);
            } else {
                thirdClick = pos;
                drawCircle(thirdClick);
                drawBezierCurve();
                sendLineToServer(firstClick, secondClick, thirdClick);
                firstClick = secondClick = thirdClick = null;
            }
        }

        function drawCircle(pos) {
            const circle = document.createElementNS('http://www.w3.org/2000/svg', 'circle');
            circle.setAttribute('cx', pos.x / 2);
            circle.setAttribute('cy', pos.y / 2);
            circle.setAttribute('r', 2);
            circle.setAttribute('fill', 'red');
            zoomGroup.appendChild(circle);
        }

        function drawBezierCurve() {
            const path = document.createElementNS('http://www.w3.org/2000/svg', 'path');
            const d = `M ${firstClick.x / 2},${firstClick.y / 2} Q ${secondClick.x / 2},${secondClick.y / 2} ${thirdClick.x / 2},${thirdClick.y / 2}`;
            path.setAttribute('d', d);
            path.setAttribute('stroke', 'black');
            path.setAttribute('fill', 'none');
            path.setAttribute('stroke-width', 1);
            zoomGroup.appendChild(path);
        }

        function sendLineToServer(start, middle, end) {
            const lineData = {
                startX: start.x / 2, startY: start.y / 2,
                middleX: middle.x / 2, middleY: middle.y / 2,
                endX: end.x / 2, endY: end.y / 2
            };
            const $server = document.querySelector('vaadin-app-layout')?.$server;
            if ($server) {
                $server.updateLineData(JSON.stringify(lineData));
            } else {
                console.error('Fant ikke server referanse for å sende data');
            }
        }
    }
});
