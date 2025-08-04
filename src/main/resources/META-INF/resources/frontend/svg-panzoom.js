export function enablePanAndZoom(svgId, options = {}) {
    const svg = document.getElementById(svgId);

    // Konfigurasjon med standardverdier
    const minZoom = options.minZoom || 0.1;
    const maxZoom = options.maxZoom || 10;
    const originalViewBox = { x: 0, y: 0, width: 100, height: 100 };
    let viewBox = { ...originalViewBox };

    let isPanning = false;
    let start = { x: 0, y: 0 };

    function updateViewBox() {
        svg.setAttribute("viewBox", `${viewBox.x} ${viewBox.y} ${viewBox.width} ${viewBox.height}`);
    }

    function resetViewBox() {
        viewBox = { ...originalViewBox };
        updateViewBox();
    }

    svg.addEventListener("wheel", (e) => {
        e.preventDefault();
        const zoomFactor = 1.1;
        const scale = e.deltaY < 0 ? 1 / zoomFactor : zoomFactor;

        const newWidth = viewBox.width * scale;
        const newHeight = viewBox.height * scale;

        // Beregn zoomnivå relativt til original bredde
        const currentZoom = originalViewBox.width / newWidth;
        if (currentZoom < minZoom || currentZoom > maxZoom) return;

        const rect = svg.getBoundingClientRect();
        const offsetX = e.clientX - rect.left;
        const offsetY = e.clientY - rect.top;

        const x = (offsetX / rect.width) * viewBox.width + viewBox.x;
        const y = (offsetY / rect.height) * viewBox.height + viewBox.y;

        viewBox.width = newWidth;
        viewBox.height = newHeight;
        viewBox.x = x - (x - viewBox.x) * scale;
        viewBox.y = y - (y - viewBox.y) * scale;

        updateViewBox();
    });

    svg.addEventListener("mousedown", (e) => {
        isPanning = true;
        start = { x: e.clientX, y: e.clientY };
        svg.style.cursor = "grabbing";
    });

    svg.addEventListener("mousemove", (e) => {
        if (!isPanning) return;
        const dx = (e.clientX - start.x) * (viewBox.width / svg.clientWidth);
        const dy = (e.clientY - start.y) * (viewBox.height / svg.clientHeight);
        viewBox.x -= dx;
        viewBox.y -= dy;
        start = { x: e.clientX, y: e.clientY };
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

    updateViewBox();
    svg.style.cursor = "grab";

    // Returner et API for ekstern kontroll
    return {
        reset: resetViewBox
    };
}
