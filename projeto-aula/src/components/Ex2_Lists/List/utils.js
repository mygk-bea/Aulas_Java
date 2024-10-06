const baseUrl = "https://upload.wikimedia.org/wikipedia/commons/";

export function getImageUrl(props) {
    return `${baseUrl}${props.imageUrl}`;
}