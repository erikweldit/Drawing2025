window.loadInlineSvg = async function(container, url, x, y, w, h) {
    const resp = await fetch(url);
    let text = await resp.text();
    text = text.replace(/<\?xml[\s\S]*?\?>/, '').replace(/<!DOCTYPE[\s\S]*?>/, '');
    const parser = new DOMParser();
    const doc = parser.parseFromString(text, 'image/svg+xml');
    const svgElem = doc.documentElement;
    svgElem.removeAttribute('width');
    svgElem.removeAttribute('height');
    svgElem.setAttribute('x', x);
    svgElem.setAttribute('y', y);
    svgElem.setAttribute('width', w);
    svgElem.setAttribute('height', h);
    container.appendChild(svgElem);
};

