function calcRoute(start, end, directionsDisplay) {
  var directionsService = new google.maps.DirectionsService();

  var request = {
    origin: start,
    destination: end,
    travelMode: 'DRIVING'
  };
  directionsService.route(request, function(result, status) {
    if (status == 'OK') {
      directionsDisplay.setDirections(result);
    }
  });
}
