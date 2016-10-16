<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Se connecter</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/CSS/Stylesdf20.css" />
</head>
<body class="aval fr-fr home">
	<div id="smart-app-banner-ipad" style="display: none;">
		<div class="wrapper background-smartbanner-ipad">
			<div class="txt-button"></div>
			<div class="close-smartbanner">X</div>
		</div>
	</div>
	<div id="headerMarqueBlanche"></div>

	<!-- MENU -->
	<jsp:include page="header.jsp" />

	<div class="container-auth">
		<div class="col-container">
			<div class="wrapper">
				<div class="bloc-top auth">
					<form:form
						action="${pageContext.request.contextPath}/j_spring_security_check"
						id="authform" method="POST">
						<span class="title">Veuillez vous identifier</span>
						<input class="input-classic-grad mail" id="UserAuth_Email"
							maxlength="50" placeholder="Email" type="text" value=""
							name="email" />
						<form:errors path="email" class="error-message" />
						<input class="input-classic-grad mdp" id="UserAuth_Password"
							maxlength="50" placeholder="Mot de passe" type="password"
							name="password" />
						<form:errors path="password" class="error-message" />
						<div class="authError">
							<span class="error-message">${error }</span>
						</div>
						<div class="btn-container">
							<input id="bt-auth" type="submit" class="validBtn"
								value="ME CONNECTER"
								style="position: relative; left: -100px; top: 30px" />
						</div>
						<div id="fb-root"></div>
						<!-- <div class="socials-signin">
							<div id="FacebookSigninButton" onClick="FacebookSignin();">
								<div class="facebook-signin"></div>
							</div>
							<div id="GoogleSigninButton">
								<div class="google-signin"></div>
							</div>
						</div> -->
					</form:form>
				</div>
				<div class="bloc-bottom">
					<span class="title">Créer un compte</span>
					<p>Concrétisez rapidement votre projet immobilier en
						bénéficiant de tous les services du compte !</p>

					
						<a href="${pageContext.request.contextPath}/inscription"><div class="validBtn">M'INSCRIRE</div></a>

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

	<script>
		function onSubmitAvalAuth(obj) {
			if (checkValidationFields($("#UserAuth_Email,#UserAuth_Password"))) {
				//showAuthError('', 0);
				onSubmitAvalForm(obj, '#bt-auth');
				return true;
			}
			return false;
		}

		initFields(true);
	</script>
	<div class="hiddenappversion">25/07/2016 05:23:22 - Prod -
		AVAL-FO_002 - v3.4.7.47 - rev 6844edf</div>
	<script
		src="../../Shared/scripts-shared9c75.js?v=6TL4uw9Cyz06gsPouY5KxvxtijlYQlz0wFzOrtNVB8k1"></script>
</body>
</html>