<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link href="${pageContext.request.contextPath}/CSS/Stylesdf20.css"
	rel="stylesheet" type="text/css" />
</head>
<body class="aval fr-fr home">
	<div id="smart-app-banner-ipad" style="display: none;">
		<div class="wrapper background-smartbanner-ipad">
			<div class="txt-button">
				<p class="txt-grey txt-ipad">
					OPTIMISEZ VOTRE RECHERCHE AVEC<br /> NOTRE APPLICATION
					AVENDREALOUER
				</p>
				<div id="btn-install-app-ipad">
					<a href="#">TÃ©lÃ©charger</a>
				</div>
				<div id="btn-launch-app-ipad">
					<a>Ouvrir</a>
				</div>
			</div>
			<div class="close-smartbanner">X</div>
		</div>
	</div>
	<div id="headerMarqueBlanche"></div>

	<!-- MENU -->
	<jsp:include page="header.jsp" />

	<header id="header" class="hp-header"
		style="width: 1024px; height: 500px">
		<div id="fd-header" class="fd-header" data-habillage="false"></div>
		<div class="home-searchengine">
			<div class="title-count">
				<h1>DES LOCATIONS</h1>
				</BR> <span
					style="color: #FFFFFF; position: relative; top: -20px; left: 450px">Location
					d'une chambre d'hotel pour une moyenne ou longue durée</span>
			</div>
			<div class="mobile-apps">
				<!--    <ul>
        <li>Disponibles sur</li>
        <li class="apple"></li>
        <li class="android"></li>
        <li class="windows"></li>
    </ul>-->
			</div>
			<div class="search"
				style="position: relative; top: 25px; height: 100px">
				<button type="hidden" class="ui-multiselect select-search-engine"
					aria-haspopup="true" id="Criteria_TransactionType">
					<span><a href="#">offre</a></span>
				</button>
				<div class="search-engine-list" style="display: none;">
					<ul class="type-select">
						<div class="col1">
							<li><a id="SearchEngineSale" class="selected buy"
								title="Achat"> <span class="check"></span> <span
									class="label">ACHAT</span> <span class="arrow"></span>
							</a></li>
							<li><a id="SearchEngineRent" class="rent" title="Location">
									<span class="check"></span> <span class="label">LOCATION</span>
									<span class="arrow"></span>
							</a></li>
							<li><a id="SearchEngineNew" class="new" title="Neuf"> <span
									class="check"></span> <span class="label">NEUF</span> <span
									class="arrow"></span>
							</a></li>
							<li><a id="SearchEngineLand" class="construct"
								title="Terrain"> <span class="check"></span> <span
									class="label">TERRAIN</span> <span class="arrow"></span>
							</a></li>
							<li><a id="SearchEngineOffices" class="pro"
								title="Bureaux et Commerces"> <span class="check"></span> <span
									class="label">BUREAUX ET COMMERCES</span> <span class="arrow"></span>
							</a></li>
						</div>
						<div class="col2">
							<div id="alert-link-home-searchengine"
								class="bloc-searchengine hp-bloc-alert"
								onClick="emailAlert('Sorter', 'Home', 0, 'HomeSearchEngine')">
								<span></span>
								<div>Créer une alerte</div>
							</div>
							<div class="bloc-searchengine entrust-search-hp">
								<a href="#" rel="nofollow"> <span></span>
									<div>Confier ma recherche</div>
								</a>
							</div>
						</div>
					</ul>

				</div>

				<div class="hp-formCtnr" id="SearchEngine">


					<form
						action="${pageContext.request.contextPath}/liste"
						class="select-buy visible" data-ajax="true"
						data-ajax-complete="enableSubmit(&#39;#bt-searchsale&#39;)"
						data-ajax-mode="replace" data-ajax-update="#SearchEngine"
						id="form0" method="post">
						<div class="upper-block">
							<div class="search-input">
								<div class="newlocCtnr"></div>
								<div id="hp-placeholer">
									<span></span> <span>Quartier, ville, département, région</span>
								</div>
								<input autocomplete="off" class="place sale-rent"
									id="Criteria_LocalityLabel" name="key_word"
									type="text" value="" placeholder="Où voulez vous habitez?" />
								<div style="position: absolute; z-index: 9999;">
									<select id="Criteria_LocalityIds" multiple="multiple"
										name="Criteria.LocalityIds" style="display: none;"></select>
								</div>
							</div>
							<input id="bt-searchsale" type="submit" name="submit-achat"
								value="Chercher" class="hp-form-submit" />
						</div>
						<div class="down-block">
							<div class="typeGroupCtnr">
								<select class="multi-select hp-buy-type hp-shadow-box"
									id="Criteria_TypeGroupIds" multiple="multiple"
									name="Criteria.TypeGroupIds"><option
										selected="selected" value="1">Appartement</option>
									<option selected="selected" value="2">Maison</option>
									<option selected="selected" value="3">Terrain/Vignoble</option>
									<option value="4">Local commercial</option>
									<option selected="selected" value="5">Immeuble</option>
									<option value="6">Boutique</option>
									<option value="7">Parking</option>
									<option value="8">Bureau</option>
									<option selected="selected" value="9">Ferme</option>
									<option selected="selected" value="10">Loft/Atelier/Surface</option>
									<option selected="selected" value="11">Ch&#226;teau</option>
									<option selected="selected" value="12">H&#244;tel
										Particulier</option>
									<option selected="selected" value="98">Chambre
										d&#39;h&#244;tes</option>
									<option value="105">Divers</option>
								</select> <input data-val="true"
									data-val-number="Le champ SearchTypeID doit Ãªtre un nombre."
									id="Criteria_SearchTypeID" name="Criteria.SearchTypeID"
									type="hidden" value="1" />
							</div>
						</div>

						<div class="advanced-search-ctnr">
							<span class="advanced-srch link" title="Plus de critÃ¨res">

							</span>
						</div>
						<input id="SearchEngineTypeId" name="SearchEngineTypeId"
							type="hidden" value="1" />
					</form>
					<script
						src="../cdn2.avendrealouer.fr/Home/SearchEngine/sale609b.js?v=SoLV-5twRqrBpSLyi7mWQ6u4myGmk37abR2U4MgkZDs1"></script>

				</div>
			</div>
		</div>
	</header>

	<div class="hp-container">
		<input
			id="SearchEngine_SearchEngineCriteria_DataContext_SeoRandomLocalityId"
			name="SearchEngine.SearchEngineCriteria.DataContext.SeoRandomLocalityId"
			type="hidden" value="3-42" />
		<div id="links-container" class="links-container"></div>
		<div class="middle-content">
			<div class="middle-wrapper">
				<div id="near-properties">
					<ul>
						<li class="house">
							<div class="picto">
								<div class="title">
									<span class="big">Chambres<br /></span> <span class="small">pas
										chers</span>
								</div>
							</div>
							<ul id="home-house-links">
								<li><a title="Vente - Maison Ã  Roanne (42)"
									href="vente/roanne-42/b-maison/loc-101-19621.html"> Vente -
										Maison Ã  Roanne (42) </a></li>
								<li><a title="Vente - Maison Ã  Roche la Moli&#232;re (42)"
									href="vente/roche-la-moliere-42/b-maison/loc-101-19452.html">
										Vente - Maison Ã  Roche la MoliÃ¨re (42) </a></li>
								<li class="more"><a
									title="Vente - Maison Ã  Saint Paul en Jarez (42)"
									href="vente/saint-paul-en-jarez-42/b-maison/loc-101-19843.html">
										Vente - Maison Ã  Saint Paul en Jarez (42) </a></li>
								<li class="more"><a title="Vente - Maison Ã  Planfoy (42)"
									href="vente/planfoy-42/b-maison/loc-101-19827.html"> Vente
										- Maison Ã  Planfoy (42) </a></li>
								<li class="more"><a title="Vente - Maison Ã  Changy (42)"
									href="vente/changy-42/b-maison/loc-101-19629.html"> Vente -
										Maison Ã  Changy (42) </a></li>
								<li><span class="more-properties" data-type="house">Voir
										+ d'annonces</span><span class="icon"></span></li>
							</ul>
						</li>
						<li class="appartment">
							<div class="picto">
								<div class="title">
									<span class="big">Chambres<br /></span> <span class="small">Ã 
										proximitÃ©</span>
								</div>
							</div>
							<ul id="home-appartment-links">
								<li><a title="Vente - Appartement Ã  La Fouillouse (42)"
									href="vente/la-fouillouse-42/b-appartement/loc-101-19722.html">
										Vente - Appartement Ã  La Fouillouse (42) </a></li>
								<li><a title="Vente - Appartement Ã  Saint Chamond (42)"
									href="vente/saint-chamond-42/b-appartement/loc-101-19676.html">
										Vente - Appartement Ã  Saint Chamond (42) </a></li>
								<li class="more"><a
									title="Vente - Appartement Ã  La Ricamarie (42)"
									href="vente/la-ricamarie-42/b-appartement/loc-101-19531.html">
										Vente - Appartement Ã  La Ricamarie (42) </a></li>
								<li class="more"><a
									title="Vente - Appartement Ã  Andr&#233;zieux Bouth&#233;on (42)"
									href="vente/andrezieux-boutheon-42/b-appartement/loc-101-19543.html">
										Vente - Appartement Ã  AndrÃ©zieux BouthÃ©on (42) </a></li>
								<li class="more"><a
									title="Vente - Appartement Ã  Rive de Gier (42)"
									href="vente/rive-de-gier-42/b-appartement/loc-101-19850.html">
										Vente - Appartement Ã  Rive de Gier (42) </a></li>
								<li><span class="more-properties" data-type="house">Voir
										+ d'annonces</span><span class="icon"></span></li>
							</ul>
						</li>
						<li class="appartment"
							style="position: relative; left: 660px; top: -250px">
							<div class="picto" style="width: 300px">
								<div class="title">
									<span class="big">Chambres<br /></span> <span class="small">VIP</span>
								</div>
							</div>
							<ul id="home-appartment-links">
								<li><a title="Vente - Appartement Ã  La Fouillouse (42)"
									href="vente/la-fouillouse-42/b-appartement/loc-101-19722.html">
										Vente - Appartement Ã  La Fouillouse (42) </a></li>
								<li><a title="Vente - Appartement Ã  Saint Chamond (42)"
									href="vente/saint-chamond-42/b-appartement/loc-101-19676.html">
										Vente - Appartement Ã  Saint Chamond (42) </a></li>
								<li class="more"><a
									title="Vente - Appartement Ã  La Ricamarie (42)"
									href="vente/la-ricamarie-42/b-appartement/loc-101-19531.html">
										Vente - Appartement Ã  La Ricamarie (42) </a></li>
								<li class="more"><a
									title="Vente - Appartement Ã  Andr&#233;zieux Bouth&#233;on (42)"
									href="vente/andrezieux-boutheon-42/b-appartement/loc-101-19543.html">
										Vente - Appartement Ã  AndrÃ©zieux BouthÃ©on (42) </a></li>
								<li class="more"><a
									title="Vente - Appartement Ã  Rive de Gier (42)"
									href="vente/rive-de-gier-42/b-appartement/loc-101-19850.html">
										Vente - Appartement Ã  Rive de Gier (42) </a></li>
								<li><span class="more-properties" data-type="house">Voir
										+ d'annonces</span><span class="icon"></span></li>
							</ul>
					</ul>
				</div>
				<div class="home-pub">
					<div id="avlineContainer-Home-Top">
						<div class="avLineContent"></div>
					</div>
				</div>
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
				<div class="so-local">
					<a href="http://www.solocalgroup.com/" target="_blank"
						rel="nofollow"></a>
				</div>
				<div class="pages-jaunes">
					<a href="http://www.pagesjaunes.fr/" target="_blank" rel="nofollow">

					</a>
				</div>
				<div class="mappy">
					<a href="http://fr.mappy.com/" target="_blank" rel="nofollow">

					</a>
				</div>
				<div class="comprendre-choisir">
					<a href="https://www.ooreka.fr/" target="_blank" rel="nofollow">
					</a>
				</div>

			</div>
		</div>
	</footer>

	<div id="avlineContainer-Home-Habillage">
		<div class="avLineContent"></div>
	</div>

	<div class="hiddenappversion">20/07/2016 06:07:36 - Prod -
		AVAL-FO_001 - v3.4.7.47 - rev 6844edf</div>
</body>
</html>