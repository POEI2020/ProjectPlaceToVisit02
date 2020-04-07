// On initialise la latitude et la longitude sur le centre de la France (centre de la carte)
var lat = 46.65;
var lon = 2.566667;
var macarte = null;

window.onload = function(){
	// Fonction d'initialisation qui s'exécute lorsque le DOM est chargé
	initMap();
};

function initMap() {    // Fonction d'initialisation de la carte

    macarte = L.map('map').setView([lat, lon], 5);  // Crée l'objet "macarte" et l'insère dans l'élément HTML qui a l'ID "map"
    // Leaflet ne récupère pas les cartes (tiles) sur un serveur par défaut. Nous devons lui préciser où nous souhaitons les récupérer. Ici, openstreetmap.fr
    L.tileLayer('https://{s}.tile.openstreetmap.fr/osmfr/{z}/{x}/{y}.png', {
            attribution: 'données © <a href="//osm.org/copyright">OpenStreetMap</a>/ODbL - rendu <a href="//openstreetmap.fr">OSM France</a>',
        minZoom: 1,
        maxZoom: 20
     }).addTo(macarte);
}

function onChange(){
    selectionCommune();
    miseAJourMap();
}


function miseAJourMap(){    //Fonction de mise à jour de la carte lorsqu'une commune est sélectionnée

    macarte.setView([lat, lon], 11);
    L.tileLayer('https://{s}.tile.openstreetmap.fr/osmfr/{z}/{x}/{y}.png', {
         attribution: 'données © <a href="//osm.org/copyright">OpenStreetMap</a>/ODbL - rendu <a href="//openstreetmap.fr">OSM France</a>', // Il est toujours bien de laisser le lien vers la source des données
         minZoom: 1,
         maxZoom: 20
    }).addTo(macarte);

    var marker = L.marker([lat, lon]).addTo(macarte);   // Ajout d'un marqueur
}

function selectionCommune() {
	var idCommune = document.getElementById("departement-select").value;
	switch(idCommune){
		case "02":
			document.getElementById("commune-name").innerHTML = "Destination : PARFONDEVAL";
            document.getElementById("description-text").innerHTML = "En terre picarde, Parfondeval concentre, sur un tapis de verdure, son habitat de briques rouges et de toits en ardoise grise aux volumes imposants et son église fortifiée, typique de la Thiérache. Presque entièrement tourné vers l'activité agricole, le village a pour paysage vergers de pommiers, pâturages et champs de maïs... Comme à la campagne !";
		    lat = 49.7393774;
			lon = 4.1586172;
			break;
		case "07":
			document.getElementById("commune-name").innerHTML = "Destination : BALAZUC";
		    document.getElementById("description-text").innerHTML = "Perchée sur sa falaise en surplomb de l'Ardèche, l'ancienne place forte des « Seigneurs de Balazuc » a gardé de nombreuses traces de son passé médiéval : dédale de ruelles tortueuses, passages voûtés sont, avec le château, l'église romane fortifiée et les portes d'enceinte, le décor originel du village.";
            lat = 44.5092291;
            lon = 4.3728494;
            break;
		case "13":
			document.getElementById("commune-name").innerHTML = "Destination : LES BAUX-DE-PROVENCE";
			document.getElementById("description-text").innerHTML = "Véritable nid d'aigle au coeur des Alpilles, Les Baux-de-Provence restent l'étape provençale incontournable qu'artistes, artisans et producteurs font vivre toute l'année.";
            lat = 43.7436371;
            lon = 4.795125;
            break;
		case "14":
		    document.getElementById("commune-name").innerHTML = "Destination : BEUVRON-EN-AUGE";
			document.getElementById("description-text").innerHTML = "Ancien fief de la famille d'Harcourt situé au coeur du Pays d'Auge, sur la route du Cidre, Beuvron fait figure de carte postale avec ses maisons à pans de bois, ses halles et ses manoirs disséminés dans la campagne.";
            lat = 49.1878748;
            lon = -0.0460321;
            break;
		case "18":
			document.getElementById("commune-name").innerHTML = "Destination : APREMENT-SUR-ALLIER";
			document.getElementById("description-text").innerHTML = "C'est au coeur du Berry que se niche Apremont, dans un paysage de bocage au bord de l'Allier. Dominé par son château entouré d'un parc floral inspiré par le jardin anglais de Vita Sackville-West à Sissinghurst, le village a été entièrement restauré au siècle dernier.";
			lat = 46.9063966;
			lon = 3.0475108;
			break;
		case "21":
			document.getElementById("commune-name").innerHTML = "Destination : CHATEAUNEUF";
			document.getElementById("description-text").innerHTML = "Surveillant la plaine et le canal de Bourgogne, Châteauneuf et son imposant château fort du XIIème siècle témoignent de la position stratégique du village entre Dijon et Autun. Les ruelles moyenâgeuses dévoilent les maisons des riches marchands bourguignons des XIV, XV et XVIème siècles et mènent jusqu'au belvédère d'où l'on découvre un panorama splendide.";
			lat = 47.2186075;
			lon = 4.6400486;
			break;
		case "24":
			document.getElementById("commune-name").innerHTML = "Destination : CASTELNAUD-LA-CHAPELLE";
			document.getElementById("description-text").innerHTML = "A une dizaine de kilomètres de Sarlat, Castelnaud-la-Chapelle surplombe le confluent entre la Dordogne et le Céou dans un panorama splendide faisant face à ses voisins de Beynac-et-Cazenac et de La Roque-Gageac. Connu pour ses deux châteaux, le château fort magnifiquement restauré abritant le Musée de la Guerre au Moyen Âge et le château des Milandes, ancienne propriété de Joséphine Baker, le village et son habitat périgourdin typique recèle lui aussi de nombreux atouts...";
			lat = 44.8137971;
			lon = 1.1512017;
			break;
		case "30":
			document.getElementById("commune-name").innerHTML = "Destination : AIGUEZE";
			document.getElementById("description-text").innerHTML = "Village médiéval de la Provence Occitane, Aiguèze surplombe les gorges de l’Ardèche et veille sur ses vignobles des Côtes du Rhône…";
			lat = 44.3034245;
			lon = 4.5553208;
			break;
		case "68":
			document.getElementById("commune-name").innerHTML = "Destination : EGUISHEIM";
			document.getElementById("description-text").innerHTML = "A quelques pas de Colmar, Eguisheim, berceau du vignoble alsacien, s'enroule en cercles concentriques autour du village qui vit naître le Pape Léon IX. A l'intérieur, le long des ruelles pavées, le village, primé au plan national et européen pour la qualité de son fleurissement, dévoile aux regards conquis la beauté de ses demeures des XVI et XVIIème siècles aux toits pointus, aux couleurs vives et aux façades à colombages.";
			lat = 48.0447968;
			lon = 7.3079618;
			break;
		case "39":
			document.getElementById("commune-name").innerHTML = "Destination : BAUME-LES-MESSIEURS";
			document.getElementById("description-text").innerHTML = "Niché dans un cirque aux confins de trois vallées dans un panorama exceptionnel, Baume-les-Messieurs enroule ses maisons autour d'une abbaye bénédictine, magnifique exemple de l'art roman jurassien abritant l'un des plus grands retables polychromes d'Europe.";
			lat = 46.7085571;
			lon = 5.646694;
			break;
		case "48":
			document.getElementById("commune-name").innerHTML = "Destination : LA GARDE-GUERIN";
			document.getElementById("description-text").innerHTML = "Dans une ambiance digne de certains paysages d'Ecosse, La Garde-Guerin domine, du haut de son plateau, l'impressionnant canyon du Chassezac. Ancien site stratégique sur la Voie Régordane reliant les côtes du Languedoc au Massif Central, le village fut plusieurs fois attaqué mais a conservé sa tour de guet ainsi que son habitat et ses ruelles empierrées.";
			lat = 44.4776961;
			lon = 3.9350612;
			break;
		case "49":
			document.getElementById("commune-name").innerHTML = "Destination : MONTSOREAU";
			document.getElementById("description-text").innerHTML = "Entre Anjou et Touraine, Montsoreau a pour cadre prestigieux la Loire, fleuve légendaire au pied duquel se mire un château du XVème siècle rendu célèbre par le roman d'Alexandre Dumas « La dame de Monsoreau ». Tout autour, ruelles fleuries aux maisons en tuffeau blanc coiffées d'ardoises et chemins verts conduisent aux vignobles du Saumurois.";
			lat = 47.2160026;
			lon = 0.0572035;
			break;
		case "53":
            document.getElementById("commune-name").innerHTML = "Destination : SAINTE-SUZANNE";
            document.getElementById("description-text").innerHTML = "Perchée sur un piton rocheux dominant de 70 mètres la vallée de l'Erve, entre Laval et Le Mans, Sainte-Suzanne est surtout connue comme la cité médiévale qui défia Guillaume le Conquérant. Et pourtant... Sa double enceinte de remparts et le riche patrimoine de cette époque encore visible ne constituent pas les témoins les plus anciens de l'histoire de Sainte-Suzanne. Le dolmen des Erves (le plus ancien monument de la Mayenne) ainsi que de récentes fouilles archéologiques révèlent des origines du site datées de cinq à six siècles avant Jésus-Christ !";
            lat = 48.1;
            lon = -0.35;
            break;
		case "84":
			document.getElementById("commune-name").innerHTML = "Destination : GORDES";
			document.getElementById("description-text").innerHTML = "Aux confins du Parc Naturel Régional du Luberon, au cœur des monts de Vaucluse, Gordes est l’emblème du village perché provençal. Mille fois décrit, photographié, admiré, il doit son aura aux illustres artistes qui l’ont autrefois révélée et y ont laissé une empreinte culturelle toujours vivace.";
			lat = 43.9110641;
			lon = 5.2002043;
			break;
	}
}



