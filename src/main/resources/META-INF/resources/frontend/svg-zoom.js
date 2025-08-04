export function enableZoomAndPan(svgId) {
    const svg = document.getElementById(svgId);
    let viewBox = { x: 0, y: 0, width: 100, height: 100 };
    let isPanning = false;
    let startPoint = { x: 0, y: 0 };

    function updateViewBox() {
        svg.setAttribute("viewBox", `${viewBox.x} ${viewBox.y} ${viewBox.width} ${viewBox.height}`);
    }

    svg.addEventListener("wheel", function (event) {
        event.preventDefault();
        const scaleFactor = 1.1;
        const zoom = event.deltaY < 0 ? 1 / scaleFactor : scaleFactor;

        const mouseX = (event.offsetX / svg.clientWidth) * viewBox.width + viewBox.x;
        const mouseY = (event.offsetY / svg.clientHeight) * viewBox.height + viewBox.y;

        viewBox.width *= zoom;
        viewBox.height *= zoom;
        viewBox.x = mouseX - (mouseX - viewBox.x) * zoom;
        viewBox.y = mouseY - (mouseY - viewBox.y) * zoom;

        updateViewBox();
    });

    svg.addEventListener("mousedown", function (event) {
        isPanning = true;
        svg.style.cursor = "grabbing";
        startPoint = { x: event.clientX, y: event.clientY };
    });

    svg.addEventListener("mousemove", function (event) {
        if (!isPanning) return;
        const dx = (event.clientX - startPoint.x) * (viewBox.width / svg.clientWidth);
        const dy = (event.clientY - startPoint.y) * (viewBox.height / svg.clientHeight);
        viewBox.x -= dx;
        viewBox.y -= dy;
        startPoint = { x: event.clientX, y: event.clientY };
        updateViewBox();
    });

    svg.addEventListener("mouseup", () => {
        isPanning = false;
        svg.style.cursor = "grab";
    });

    svg.addEventListener("mouseleave", () => {
        isPanning = false;
        svg.style.cursor = "grab";
    });
}
