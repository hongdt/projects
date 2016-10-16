<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Espace personel</title>
<link href="${pageContext.request.contextPath}/CSS/Stylesdf20.css"
	rel="stylesheet" type="text/css" />
</head>
<body class="aval fr-fr">

	<!-- MENU -->
	<jsp:include page="header.jsp" />
	<div class="container-ep">
		<h1>Bienvenue sur votre espace Personnel</h1>
		<div class="colCtnr">
			<div class="col-menu" style="position: relative; top: 28px">
				<div class="block-account" style="">
					<div class="block-avatar">
						<div class="avatarCtnr">
							<img src="${pageContext.request.contextPath}/CSS/avatar.jpg" width="62" height="64">
						</div>

					</div>
					<div class="block-name">
						Bonjour<br /> <span class="username"></span>

					</div>
					<p>
						Trouvez plus vite en complétant votre profil à 100%. &nbsp;<a
							href="/Users/Users/Profil">Editer</a>
					</p>
				</div>
				<nav>
				<ul class="menu-left">

					<li><a href="#" class="ep ">Profil<span></span></a></li>
					<li><a href="#" class="ep selected">Mes offres<span></span></a></li>
					<li><a href="#" class="ep selected">Mes demandes<span></span></a></li>
					<li><a href="#" class="red">Liste des offres favorites</a></li>
					<li><a href="#" class="red">Messageries</a></li>


					</li>
				</ul>
				</nav>
			</div>
			<div class="col-content">
				<h2>Mon profil</h2>
				<section class="profil">
				<p>Optimisez votre recherche en complétant votre profil. Mieux
					vous connaître nous permet de cibler plus précisement votre besoin.
					Rassurez vous, vos données ne sont pas divulguées à des tiers sans
					votre consentement.</p>

				<form method="post">
					<div class="col clear">
						<div id="User_TitleContainer">
							<input list="civility" type="text" id="civil"
								placeholder="Vous êtes :">
							<datalist id="civility">
							<option value="Monsieur">
							<option value="Madame">
							</datalist>
						</div>

						<input class="name" id="User_LastName" maxlength="50"
							name="User.LastName" type="text" value="dzoulou" /> <input
							class="first-name" id="User_FirstName" maxlength="50"
							name="User.FirstName" type="text" value="vinci savi" /> <input
							class="input-classic onlynum" id="User_MobilePhone"
							maxlength="16" name="User.MobilePhone" placeholder="Téléphone"
							type="text" value="" /> <input class="input-classic name"
							id="User_TownName" maxlength="50" name="User.TownName"
							placeholder="Ville" type="text" value="" /> <input
							class="input-classic mail" id="User_Email" maxlength="50"
							name="User.Email" type="text" value="vincidzoulou@yahoo.fr" />
					</div>
					<div class="col right"></div>
					<div class="col-large">
						<input class="input-classic name-path" id="User_Adress"
							maxlength="100" name="User.Adress" placeholder="Adresse"
							type="text" value="" /><br> <br>
					</div>
					<div class="col clear">
						<div id="User_ProfilsContainer">
							<input list="proprietaire" type="text" id="choix"
								placeholder="Vous êtes :">
							<datalist id="proprietaire">
							<option value="Locataire">
							<option value="Acqu&#233;reur">
							<option value=" acc&#233;dant">
							<option value="Investisseur">
							</datalist>
						</div>
					</div>
					<div class="col right"></div>
					<input id="bt-updateprofil" type="submit" class="validBtn"
						value="Valider" />
				</form>
				</section>
				<h2 class="unsubscribe">Désinscription</h2>
				<section>
				<p>En vous désinscrivant, votre compte sera supprimé et vous ne
					recevrez plus d'alerte ni d'e-mail du site. Pour vous désinscrire
					du site , cliquez sur le bouton ci-dessous :</p>
				<input type="button" class="validBtn cpointer"
					value="Supprimer mon compte" /> </section>
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
			<a href="#" target="_blank" rel="nofollow">
				<div class="so-local"></div>
			</a> <a href="#" target="_blank" rel="nofollow">
				<div class="pages-jaunes"></div>
			</a> <a href="#" target="_blank" rel="nofollow">
				<div class="mappy"></div>
			</a> <a href="#" target="_blank" rel="nofollow">
				<div class="comprendre-choisir"></div>
			</a>
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