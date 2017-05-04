function main(){
  var map = initMap();
  makeButton(map);
}

function readStart(){
  var start = document.querySelector("#start");
  return start.value;
}

function readEnd(){
  var end = document.querySelector("#end");
  return end.value;
}
