<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Offre</title>
<link href="${pageContext.request.contextPath}/CSS/Stylesdf20.css"
	rel="stylesheet" type="text/css" />
</head>
<body class="aval fr-fr home">

	<div id="smart-app-banner-ipad" style="display: none;">
		<div class="wrapper background-smartbanner-ipad">
			<div class="txt-button">

				<div id="btn-install-app-ipad">
					<a href="#"></a>
				</div>
				<div id="btn-launch-app-ipad">
					<a></a>
				</div>
			</div>
			<div class="close-smartbanner"></div>
		</div>
	</div>
	<div id="headerMarqueBlanche"></div>

	<!-- MENU -->
	<jsp:include page="header.jsp" />

	<div class="container-auth">
		<div class="col-container">
			<div class="wrapper">
				<div class="bloc-top auth" style="height: 480px">

					<form:form action="${pageContext.request.contextPath}/offre" id="offerForm" modelAttribute="offerForm" method="post" enctype="multipart/form-data">
						<span class="title">Déposez votre offre ici...</span>
						<br>
						<br>
						
						<input id="nom_annonce" name="nameAdvertise" maxlength="50" name="nom_annonce" placeholder="Nom de l'annonce* " type="text" value=""/>
						
						<input id="surface" name="area" maxlength="50" name="surface" placeholder="Surface (m x m)* " type="text" value="" />
						
						<input id="nombre" name="numberOfParts" maxlength="50" placeholder="Nombre de pièces * " type="text" value="" />
						
						<input id="prix" name="price" maxlength="50" placeholder="Prix (USD)* " type="text" value="" />
						
						<!-- <select path="country" name="pays">
							<option value="NONE" label="--- Choisissez votre pays ---" />
							<options items="${countryList}" />
						</select>  -->
						
						<input id="pays" maxlength="50" name="country" placeholder="Pays* " type="text" value="" />
						
						<input id="ville" maxlength="50" name="city" placeholder="Ville* " type="text" value="" />
						
						<input id="rue" maxlength="50" name="street" placeholder="Rue* " type="text" value="" />
						
						<input type="file" name="image1" size="40" maxlength="50" style="position: relative; left: -30px" />
						
						<input type="file" name="image2" size="40" maxlength="50" style="position: relative; left: -30px" />
						
						<input type="file" name="image3" size="40" maxlength="50" style="position: relative; left: -30px" />
						
						<textarea name="description" rows="4" cols="41" placeholder="Décrivez votre offre ici..."></textarea>
						
						<input type="hidden" name="status" value="1"/>
						
						<input id="bt-auth" type="submit" class="validBtn" value="Sauvegardez" style="position: relative; left: -290px; top: 30px" />
						<input id="bt-auth" type="reset" class="validBtn" value="Annulez" style="position: relative; left: 55px; top: 30px; width: 100px" />

						<div id="fb-root"></div>
						<div id="GoogleSigninButton">
							<div class="google-signin"></div>
						</div>
					</form:form>
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




	<div class="hiddenappversion">25/07/2016 05:23:22 - Prod -
		AVAL-FO_002 - v3.4.7.47 - rev 6844edf</div>

</body>

</html>