<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Résultats</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Stylesdf20.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/CSS/validation.js"></script>
</head>
<body class="aval fr-fr ResultList">
	<div id="headerMarqueBlanche"></div>
	<!-- MENU -->
	<jsp:include page="header.jsp" />
	<div class="s-engine">
		<div class="search-header">
			<h1 id="annonces-paris">
				<form method="post" style="position: relative; left: 180px">
					<div class="categ c-search">
						<div class="srchTitle" style="width: 600px; height: 100px">
							<!--  <input list="Prix" type="text" id="choix_prix" placeholder="Prix" size="5">
							<datalist id="Prix">
								<option value="Prix 1">
								<option value="Prix 2">
								<option value="Prix 3">
							</datalist>  -->
							<input id="prix" maxlength="50" name="price" placeholder="Prix ($)" type="text" value="" />

							<!-- <input list="surface" type="text" id="choix_surface" placeholder="Surface" size="7">
							<datalist id="surface">
								<option value="surface 1">
								<option value="surface 2">
								<option value="surface 3">
							</datalist> -->
							<input id="surface" maxlength="50" name="area" placeholder="Surface (mxm)" type="text" value="" />
							
							<input id="numberOfParts" maxlength="50" name="numberOfParts" placeholder="Nombre de pièce" type="text" value="" />

							<!-- <input list="piece" type="text" id="choix_piece"
								placeholder="PiÃ¨ces" size="7">
							<datalist id="piece">
							<option value="piece 1">
							<option value="piece 2">
							<option value="piece 3">
							</datalist> -->
							
							<!-- <input list="Localite" type="text" id="choix_Localite"
								placeholder="LocalitÃ©s" size="7">
							<datalist id="Localite">
							<option value="Localite 1">
							<option value="Localite 2">
							<option value="Localite 3">
							</datalist> -->

							<input type="submit" value="Chercher" size="10">
						</div>
					</div>

				</form>
			</h1>
			<div class="localityStatsText"></div>
		</div>



		<div class="search-prop">


			<div style="width: 100%; height: 25px; display: block"></div>

		</div>

	</div>
	</div>
	</div>

	</div>




	<div class="container-lr" style="position: relative; left: 160px">
		<div class="colCtnr">
			<div class="col-main" id="colMain-List">
				<ul id="result-list" class="mode-list">




					<li data-accid="57887" data-adid="13418691"
						data-infos="01 44 90 03 94" data-tranid="2"><a href="#"
						class="picCtnr">
							<div class="product-media">

								<img onerror="ErrorImg(this);" src="CSS/1.jpg" />
								<div class="wrapper-agencyimg">
									<div class="list-item-agencyimg">
										<img onError="cleanImg(this);" class="img-agency"
											src="http://media1.annoncesjaunes.fr/Files/Upload/ComptePro/ce3bebe1-1e24-4f19-9114-783ffa3a374e_large.png"
											alt="" />
									</div>
								</div>
							</div>
					</a>
						<div class="details ">


							<a class="cofidis-monthly" href="#"> DÃ©tail </a>


							<div class="features"></div>
							<span class="promoter"> &nbsp; </span> <span class="price ">
								1&#160;040 â‚¬ <sup>CC(2)</sup>
							</span> <span class="refPriceForDisplay"> &nbsp; </span> <span
								class="loca">PARIS (75017)</span>
							<ul>
								<li class="first">Appartement</li>
								<li>2 pi&#232;ces</li>
								<li>37 m&#178;</li>
							</ul>

							<span class="propShortDesc"> PARIS 17&#232;me: RUE DES
								EPINETTES Appartement de 37m&#178; au 3&#232;me &#233;tage
								comprenant une entr&#233;e avec placard , un s&#233;jour sur
								cour , une... </span> </a>
							<div class="links">
								<a href="#" class="sendMessage">Contacter</a>
							</div>
						</div>
						<div class="bottomInfos">
							<div class="photo">
								<div></div>
								<span>4</span>
							</div>
							<div class="agency">
								<span>AGENCE DES BATIGNOLLES</span>
							</div>
						</div></li>
					<li data-accid="57887" data-adid="13870903"
						data-infos="01 44 90 03 94" data-tranid="2"><a href="#"
						class="picCtnr">
							<div class="product-media">

								<img onerror="ErrorImg(this);" src="CSS/2.jpg" />
								<div class="wrapper-agencyimg">
									<div class="list-item-agencyimg">
										<img onError="cleanImg(this);" class="img-agency"
											src="http://media1.annoncesjaunes.fr/Files/Upload/ComptePro/ce3bebe1-1e24-4f19-9114-783ffa3a374e_large.png"
											alt="" />
									</div>
								</div>
							</div>
					</a>
						<div class="details ">


							<a class="cofidis-monthly" href="#"> DÃ©tail </a> <a
								class="linkCtnr" href="#">
								<div class="features"></div> <span class="promoter">
									&nbsp; </span> <span class="price "> 926 â‚¬ <sup>CC(2)</sup>
							</span> <span class="refPriceForDisplay"> &nbsp; </span> <span
								class="loca">PARIS (75017)</span>
								<ul>
									<li class="first">Appartement</li>
									<li>1 pi&#232;ce</li>
									<li>31 m&#178;</li>
								</ul> <span class="propShortDesc"> PARIS 17 - PLACE DE CLICHY
									/ RUE DES DAMES Grand Studio au 5&#232;me &#233;tage sans
									ascenseur compos&#233; d&#39;une entr&#233;e d&#39;une cuisine,
									d&#39;u... </span>
							</a>
							<div class="links">
								<a href="#13870903" class="sendMessage">Contacter</a>
							</div>
						</div>
						<div class="bottomInfos">
							<div class="photo">
								<div></div>
								<span>4</span>
							</div>
							<div class="agency">
								<span>AGENCE DES BATIGNOLLES</span>
							</div>
						</div></li>

					<li data-accid="57887" data-adid="13870903"
						data-infos="01 44 90 03 94" data-tranid="2"><a href="#"
						class="picCtnr">
							<div class="product-media">

								<img onerror="ErrorImg(this);" src="CSS/3.jpg" />
								<div class="wrapper-agencyimg">
									<div class="list-item-agencyimg">
										<img onError="cleanImg(this);" class="img-agency"
											src="http://media1.annoncesjaunes.fr/Files/Upload/ComptePro/ce3bebe1-1e24-4f19-9114-783ffa3a374e_large.png"
											alt="" />
									</div>
								</div>
							</div>
					</a>
						<div class="details ">


							<a class="cofidis-monthly" href="#"> DÃ©tail </a> <a
								class="linkCtnr" href="#">
								<div class="features"></div> <span class="promoter">
									&nbsp; </span> <span class="price "> 926 â‚¬ <sup>CC(2)</sup>
							</span> <span class="refPriceForDisplay"> &nbsp; </span> <span
								class="loca">PARIS (75017)</span>
								<ul>
									<li class="first">Appartement</li>
									<li>1 pi&#232;ce</li>
									<li>31 m&#178;</li>
								</ul> <span class="propShortDesc"> PARIS 17 - PLACE DE CLICHY
									/ RUE DES DAMES Grand Studio au 5&#232;me &#233;tage sans
									ascenseur compos&#233; d&#39;une entr&#233;e d&#39;une cuisine,
									d&#39;u... </span>
							</a>
							<div class="links">
								<a href="#13870903" class="sendMessage">Contacter</a>
							</div>
						</div>
						<div class="bottomInfos">
							<div class="photo">
								<div></div>
								<span>4</span>
							</div>
							<div class="agency">
								<span>AGENCE DES BATIGNOLLES</span>
							</div>
						</div></li>

				</ul>
				<div id="multilead-form"></div>


				<div id="adcontainerbottom" style="margin: 10px 0"></div>



			</div>

			<div class="col-side ">
				<div class="lr-pub-top">



					<div id="avlineContainer-ResultList-Top"
						class="side-block ad-block">
						<div class="avLineContent">
							<script charset="ISO-8859-1" type="text/javascript">
								_adsLoader
										.load('http://adnext.fr/richmedia.adv?id=103740&plc=3&w=300&h=250&s=fixed&section=LR,Appartement,Location,dpt75,ile_de_france&ts=');
							</script>
						</div>
					</div>

				</div>

				<div class="lr-pub-bottom">



					<div id="avlineContainer-ResultList-Bottom"
						class="side-block ad-block">
						<div class="avLineContent">
							<script charset="ISO-8859-1" type="text/javascript">
								_adsLoader
										.load('http://adnext.fr/richmedia.adv?id=103740&plc=12&w=300&h=250&s=fixed&section=LR,Appartement,Location,dpt75,ile_de_france&ts=');
							</script>
						</div>
					</div>

				</div>


				<script
					src="/Shared/ServicesPublicities?v=QDpau2NDjdvRs2PDZLDA33zbBxCSDdo8aQWScImQUTA1"></script>





				<div id="adcontainertop"></div>
			</div>
		</div>
	</div>


	<span class="back-to-top" title="Remonter"></span>
	<div class="pre-footer">
		<div class="wrapper">

			<div class="breadcrumb" id="footer-breadcrumb"></div>
			<div class="bottom-mentions"></div>
		</div>
	</div>
	<footer>
	<div class="footer-brands-wrapper">
		<div class="brands">
			<a href="http://www.solocalgroup.com/" target="_blank" rel="nofollow">
				<div class="so-local"></div>
			</a> <a href="http://www.pagesjaunes.fr/" target="_blank" rel="nofollow">
				<div class="pages-jaunes"></div>
			</a> <a href="http://fr.mappy.com/" target="_blank" rel="nofollow">
				<div class="mappy"></div>
			</a> <a href="https://www.ooreka.fr/" target="_blank" rel="nofollow">
				<div class="comprendre-choisir"></div>
			</a>
		</div>
	</div>
	</footer>







	<div id="avlineContainer-ResultList-Habillage" class="">
		<div class="avLineContent"></div>
	</div>

	<div class="hiddenappversion">07/09/2016 17:46:24 - Prod -
		AVAL-FO_001 - v3.4.9.13 - rev 20cb3f1</div>



</body>
</html>