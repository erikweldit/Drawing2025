window.loadInlineSvg = async function(container, url, x, y, w, h) {
    const resp = await fetch(url);
    const text = await resp.text();
    const parser = new DOMParser();
    const doc = parser.parseFromString(text, 'image/svg+xml');
    const inner = doc.documentElement;
    inner.removeAttribute('width');
    inner.removeAttribute('height');
    inner.setAttribute('x', x);
    inner.setAttribute('y', y);
    inner.setAttribute('width', w);
    inner.setAttribute('height', h);
    container.appendChild(inner);
};
