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
<title>Inscription</title>
<link href="${pageContext.request.contextPath}/CSS/Stylesdf20.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/JS/validation.js"></script>
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
					<a href="#">Télécharger</a>
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

	<div class="container-entrust">
		<div class="colCtnr">
			<div class="col-infos">
				<div class="main-title">
					Créez votre compte gratuitement<br />et personnalisez votre
					recherche
				</div>
				<div class="infos account">
					<div class="block mail">
						<div></div>
						<p>
							<strong>Créez votre alerte email</strong><br /> L’alerte email
							vous permet de recevoir toutes <br />les nouvelles annonces
							correspondant <br />à votre recherche dès leur parution.
						</p>
					</div>
					<div class="block star">
						<div></div>
						<p>
							<strong>Sauvegardez vos recherches et annonces</strong><br />
							Sauvegardez vos recherches et annonces afin<br /> de les
							comparer, de les retrouver facilement et <br />de les partager
							avec votre famille et vos amis.
						</p>
					</div>
					<div class="block paper">
						<div></div>
						<p>
							<strong>Suivez l’actualité de l’immobilier</strong><br />
							Retrouvez toutes les informations et bons plans<br />d’AVendreALouer.
							Prix de l’immobilier,<br />conseils pratiques, informations
							juridiques,<br /> et tendances habitat.
						</p>
					</div>
					<div class="block mobile">
						<div></div>
						<p>
							<strong>Rechercher aussi sur smartphone &amp; tablettes</strong><br />
							Téléchargez l’application mobile AVendreALouer.fr ou utilisez la
							version optimisée pour mobile. Recevez des notifications et
							trouvez sans rechercher.
						</p>
					</div>
				</div>
			</div>
			<div class="col-form">
				<div class="bloc-form">

					<div class="main-title">Inscription rapide</div>
					<div id="fb-root"></div>

					<div class="socials-signin"></div>

					<div class="main-title">remplissez le formulaire</div>


					<form:form action="${pageContext.request.contextPath}/inscription"
						id="accountForm" modelAttribute="accountForm" method="post">
						<p>
							<form:input class="input-classic large mail" id="User_Email"
								maxlength="50" name="email" path="email" placeholder="Email *"
								type="text" value="" />
							<form:errors path="email" class="error-message" />
						<div id="subform">

							<div id="User_PasswordContainer" class="container-pwd clear">
								<form:input autocomplete="off" class="input-classic large mdp"
									id="User_Password" maxlength="50" path="password"
									name="password"
									placeholder="Mot de passe (6 caractères minimum) *"
									type="password" />
								<form:errors path="password" class="error-message" />
							</div>
							<div id="User_ConfirmPasswordContainer">
								<form:input autocomplete="off" class="input-classic large mdp"
									id="User_ConfirmPassword" maxlength="50" name="rePassword"
									path="rePassword" placeholder="Mot de passe (vérification) *"
									type="password" />
								<form:errors path="rePassword" class="error-message" />
							</div>
						</div>
						<input id="bt-validateregister" type="submit" value="Valider"
							class="validBtn center" />
					</form:form>
					<div id="subform-Userspace" style="display: none">

						<div class="red-btns"></div>
					</div>

					<div id="subform-Mandatory" class="mandatory"
						style="margin-top: 10px">( * ) Champs obligatoires</div>

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



	<div class="hiddenappversion">25/07/2016 05:33:01 - Prod -
		AVAL-FO_001 - v3.4.7.47 - rev 6844edf</div>

</body>

</html>