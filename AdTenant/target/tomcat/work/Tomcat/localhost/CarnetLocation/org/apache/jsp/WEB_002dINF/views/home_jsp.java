/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-17 09:45:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Accueil</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/CSS/Stylesdf20.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"aval fr-fr home\">\r\n");
      out.write("\t<div id=\"smart-app-banner-ipad\" style=\"display: none;\">\r\n");
      out.write("\t\t<div class=\"wrapper background-smartbanner-ipad\">\r\n");
      out.write("\t\t\t<div class=\"txt-button\">\r\n");
      out.write("\t\t\t\t<p class=\"txt-grey txt-ipad\">\r\n");
      out.write("\t\t\t\t\tOPTIMISEZ VOTRE RECHERCHE AVEC<br /> NOTRE APPLICATION\r\n");
      out.write("\t\t\t\t\tAVENDREALOUER\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div id=\"btn-install-app-ipad\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">TÃ©lÃ©charger</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"btn-launch-app-ipad\">\r\n");
      out.write("\t\t\t\t\t<a>Ouvrir</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"close-smartbanner\">X</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"headerMarqueBlanche\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- MENU -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"header\" class=\"hp-header\"\r\n");
      out.write("\t\tstyle=\"width: 1024px; height: 500px\">\r\n");
      out.write("\t\t<div id=\"fd-header\" class=\"fd-header\" data-habillage=\"false\"></div>\r\n");
      out.write("\t\t<div class=\"home-searchengine\">\r\n");
      out.write("\t\t\t<div class=\"title-count\">\r\n");
      out.write("\t\t\t\t<h1>DES LOCATIONS</h1>\r\n");
      out.write("\t\t\t\t</BR> <span\r\n");
      out.write("\t\t\t\t\tstyle=\"color: #FFFFFF; position: relative; top: -20px; left: 450px\">Location\r\n");
      out.write("\t\t\t\t\td'une chambre d'hotel pour une moyenne ou longue durée</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"mobile-apps\">\r\n");
      out.write("\t\t\t\t<!--    <ul>\r\n");
      out.write("        <li>Disponibles sur</li>\r\n");
      out.write("        <li class=\"apple\"></li>\r\n");
      out.write("        <li class=\"android\"></li>\r\n");
      out.write("        <li class=\"windows\"></li>\r\n");
      out.write("    </ul>-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"search\"\r\n");
      out.write("\t\t\t\tstyle=\"position: relative; top: 25px; height: 100px\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"ui-multiselect select-search-engine\"\r\n");
      out.write("\t\t\t\t\taria-haspopup=\"true\" id=\"Criteria_TransactionType\">\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\">offre</a></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<div class=\"search-engine-list\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"type-select\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"SearchEngineSale\" class=\"selected buy\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Achat\"> <span class=\"check\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label\">ACHAT</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"SearchEngineRent\" class=\"rent\" title=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"check\"></span> <span class=\"label\">LOCATION</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"SearchEngineNew\" class=\"new\" title=\"Neuf\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"check\"></span> <span class=\"label\">NEUF</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"SearchEngineLand\" class=\"construct\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Terrain\"> <span class=\"check\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label\">TERRAIN</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"SearchEngineOffices\" class=\"pro\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Bureaux et Commerces\"> <span class=\"check\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label\">BUREAUX ET COMMERCES</span> <span class=\"arrow\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"alert-link-home-searchengine\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"bloc-searchengine hp-bloc-alert\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonClick=\"emailAlert('Sorter', 'Home', 0, 'HomeSearchEngine')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>CrÃ©er une alerte</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bloc-searchengine entrust-search-hp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" rel=\"nofollow\"> <span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>Confier ma recherche</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"hp-formCtnr\" id=\"SearchEngine\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form\r\n");
      out.write("\t\t\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/liste\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"select-buy visible\" data-ajax=\"true\"\r\n");
      out.write("\t\t\t\t\t\tdata-ajax-complete=\"enableSubmit(&#39;#bt-searchsale&#39;)\"\r\n");
      out.write("\t\t\t\t\t\tdata-ajax-mode=\"replace\" data-ajax-update=\"#SearchEngine\"\r\n");
      out.write("\t\t\t\t\t\tid=\"form0\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\tonSubmit=\"onSubmitAvalForm(this, &#39;#bt-searchsale&#39;)\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"upper-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"newlocCtnr\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"hp-placeholer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span> <span>Quartier, ville, département, région</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input autocomplete=\"off\" class=\"place sale-rent\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"Criteria_LocalityLabel\" name=\"key_word\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" value=\"\" placeholder=\"Où voulez vous habitez?\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"position: absolute; z-index: 9999;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"Criteria_LocalityIds\" multiple=\"multiple\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"Criteria.LocalityIds\" style=\"display: none;\"></select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"bt-searchsale\" type=\"submit\" name=\"submit-achat\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Chercher\" class=\"hp-form-submit\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"down-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"typeGroupCtnr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"multi-select hp-buy-type hp-shadow-box\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"Criteria_TypeGroupIds\" multiple=\"multiple\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"Criteria.TypeGroupIds\"><option\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tselected=\"selected\" value=\"1\">Appartement</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"2\">Maison</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"3\">Terrain/Vignoble</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"4\">Local commercial</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"5\">Immeuble</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"6\">Boutique</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"7\">Parking</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"8\">Bureau</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"9\">Ferme</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"10\">Loft/Atelier/Surface</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"11\">Ch&#226;teau</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"12\">H&#244;tel\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tParticulier</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"98\">Chambre\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\td&#39;h&#244;tes</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"105\">Divers</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> <input data-val=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-val-number=\"Le champ SearchTypeID doit Ãªtre un nombre.\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"Criteria_SearchTypeID\" name=\"Criteria.SearchTypeID\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"hidden\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"advanced-search-ctnr\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"advanced-srch link\" title=\"Plus de critÃ¨res\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"SearchEngineTypeId\" name=\"SearchEngineTypeId\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"hidden\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<script\r\n");
      out.write("\t\t\t\t\t\tsrc=\"../cdn2.avendrealouer.fr/Home/SearchEngine/sale609b.js?v=SoLV-5twRqrBpSLyi7mWQ6u4myGmk37abR2U4MgkZDs1\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"hp-container\">\r\n");
      out.write("\t\t<input\r\n");
      out.write("\t\t\tid=\"SearchEngine_SearchEngineCriteria_DataContext_SeoRandomLocalityId\"\r\n");
      out.write("\t\t\tname=\"SearchEngine.SearchEngineCriteria.DataContext.SeoRandomLocalityId\"\r\n");
      out.write("\t\t\ttype=\"hidden\" value=\"3-42\" />\r\n");
      out.write("\t\t<div id=\"links-container\" class=\"links-container\"></div>\r\n");
      out.write("\t\t<div class=\"middle-content\">\r\n");
      out.write("\t\t\t<div class=\"middle-wrapper\">\r\n");
      out.write("\t\t\t\t<div id=\"near-properties\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"house\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"picto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"big\">Chambres<br /></span> <span class=\"small\">pas\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tchers</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"home-house-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a title=\"Vente - Maison Ã  Roanne (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/roanne-42/b-maison/loc-101-19621.html\"> Vente -\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tMaison Ã  Roanne (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a title=\"Vente - Maison Ã  Roche la Moli&#232;re (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/roche-la-moliere-42/b-maison/loc-101-19452.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Maison Ã  Roche la MoliÃ¨re (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Maison Ã  Saint Paul en Jarez (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/saint-paul-en-jarez-42/b-maison/loc-101-19843.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Maison Ã  Saint Paul en Jarez (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a title=\"Vente - Maison Ã  Planfoy (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/planfoy-42/b-maison/loc-101-19827.html\"> Vente\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t- Maison Ã  Planfoy (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a title=\"Vente - Maison Ã  Changy (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/changy-42/b-maison/loc-101-19629.html\"> Vente -\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tMaison Ã  Changy (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><span class=\"more-properties\" data-type=\"house\">Voir\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ d'annonces</span><span class=\"icon\"></span></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"appartment\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"picto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"big\">Chambres<br /></span> <span class=\"small\">Ã \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tproximitÃ©</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"home-appartment-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a title=\"Vente - Appartement Ã  La Fouillouse (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/la-fouillouse-42/b-appartement/loc-101-19722.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  La Fouillouse (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a title=\"Vente - Appartement Ã  Saint Chamond (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/saint-chamond-42/b-appartement/loc-101-19676.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  Saint Chamond (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Appartement Ã  La Ricamarie (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/la-ricamarie-42/b-appartement/loc-101-19531.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  La Ricamarie (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Appartement Ã  Andr&#233;zieux Bouth&#233;on (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/andrezieux-boutheon-42/b-appartement/loc-101-19543.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  AndrÃ©zieux BouthÃ©on (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Appartement Ã  Rive de Gier (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/rive-de-gier-42/b-appartement/loc-101-19850.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  Rive de Gier (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><span class=\"more-properties\" data-type=\"house\">Voir\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ d'annonces</span><span class=\"icon\"></span></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"appartment\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"position: relative; left: 660px; top: -250px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"picto\" style=\"width: 300px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"big\">Chambres<br /></span> <span class=\"small\">VIP</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"home-appartment-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a title=\"Vente - Appartement Ã  La Fouillouse (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/la-fouillouse-42/b-appartement/loc-101-19722.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  La Fouillouse (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a title=\"Vente - Appartement Ã  Saint Chamond (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/saint-chamond-42/b-appartement/loc-101-19676.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  Saint Chamond (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Appartement Ã  La Ricamarie (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/la-ricamarie-42/b-appartement/loc-101-19531.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  La Ricamarie (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Appartement Ã  Andr&#233;zieux Bouth&#233;on (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/andrezieux-boutheon-42/b-appartement/loc-101-19543.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  AndrÃ©zieux BouthÃ©on (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"more\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Vente - Appartement Ã  Rive de Gier (42)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"vente/rive-de-gier-42/b-appartement/loc-101-19850.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tVente - Appartement Ã  Rive de Gier (42) </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><span class=\"more-properties\" data-type=\"house\">Voir\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ d'annonces</span><span class=\"icon\"></span></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"home-pub\">\r\n");
      out.write("\t\t\t\t\t<div id=\"avlineContainer-Home-Top\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"avLineContent\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<span class=\"back-to-top\" title=\"Remonter\"></span>\r\n");
      out.write("\t<div class=\"pre-footer\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<div class=\"breadcrumb\" id=\"footer-breadcrumb\"></div>\r\n");
      out.write("\t\t\t<div class=\"bottom-mentions\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<footer>\r\n");
      out.write("\t\t<div class=\"footer-brands-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"brands\">\r\n");
      out.write("\t\t\t\t<div class=\"so-local\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.solocalgroup.com/\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\trel=\"nofollow\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"pages-jaunes\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.pagesjaunes.fr/\" target=\"_blank\" rel=\"nofollow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mappy\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://fr.mappy.com/\" target=\"_blank\" rel=\"nofollow\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"comprendre-choisir\">\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.ooreka.fr/\" target=\"_blank\" rel=\"nofollow\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"avlineContainer-Home-Habillage\">\r\n");
      out.write("\t\t<div class=\"avLineContent\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"hiddenappversion\">20/07/2016 06:07:36 - Prod -\r\n");
      out.write("\t\tAVAL-FO_001 - v3.4.7.47 - rev 6844edf</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
