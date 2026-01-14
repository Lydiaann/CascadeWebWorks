function expandImg(imgElement) {

const expandedImg =  document.getElementById("expanded-img-content");
const overlay = document.getElementById("overlay");

expandedImg.src = imgElement.dataset.large;
overlay.style.display="block"

}

function off() {
  document.getElementById("overlay").style.display = "none";

}