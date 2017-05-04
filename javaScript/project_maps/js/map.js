function initMap() {
  var criar = {lat: -23.501, lng: -46.849}; //Criar.me coordinates
  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 17,
    center: criar
  });
  return map;
}
