function makeButton(map){
  var directionsDisplay = new google.maps.DirectionsRenderer();

  var button = document.querySelector("#go_button");
  button.addEventListener("click", function(event) {
    event.preventDefault();
    var start = readStart();
    var end = readEnd();
    calcRoute(start, end, directionsDisplay);
    directionsDisplay.setMap(map);
  });
}
