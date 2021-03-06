package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.PhongTro;
import dao.PhongTroDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en-US\" prefix=\"\"><!--<![endif]--><head>\n");
      out.write("        <meta name=\"google-site-verification\" content=\"tSsMrq71kipW3OwGk4GvTRrBIrXc2jGBgt0mCXLEkEA\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta content=\"1748349635396853\" property=\"fb:app_id\">\n");
      out.write("        <title>Cho thuê phòng trọ nhà trọ, tìm phòng trọ</title>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/toastr.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/jquery.bxslider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/select2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/jquery.mmenu.all.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.min.20170814.css?v=23\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/phongtro.tablet.css?v=23\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/phongtro.mobile.css?v=23\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/fonts.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"Cho thuê phòng trọ, nhà trọ số 1 Việt Nam - Website đăng tin cho thuê phòng trọ, tìm phòng trọ nhanh, hiệu quả với hơn 70.000+ tin đăng và 2.000.000 lượt xem mõi tháng.\">\n");
      out.write("        <meta name=\"keywords\" content=\"cho thuê,phòng trọ,nhà trọ,tìm phòng trọ,thuê phòng trọ\">\n");
      out.write("        <meta content=\"blog\" property=\"og:type\">\n");
      out.write("        <meta content=\"Cho thuê phòng trọ nhà trọ, tìm phòng trọ\" property=\"og:title\">\n");
      out.write("        <meta content=\"Kênh cho thuê phòng trọ, nhà trọ, tìm phòng trọ nhanh và hiệu quả nhất\" property=\"og:description\">\n");
      out.write("        <meta content=\"Cho thuê phòng trọ nhà trọ, tìm phòng trọ\" property=\"og:site_name\">\n");
      out.write("        <meta name=\"twitter:card\" content=\"summary\">\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            img.wp-smiley,\n");
      out.write("            img.emoji {\n");
      out.write("                display: inline !important;\n");
      out.write("                border: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                height: 1em !important;\n");
      out.write("                width: 1em !important;\n");
      out.write("                margin: 0 .07em !important;\n");
      out.write("                vertical-align: -0.1em !important;\n");
      out.write("                background: none !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link id=\"wpfp-css\" href=\"css/wpfp.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link id=\"contact-form-7-css\" href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link id=\"breadcrumbs-styles-css\" href=\"css/pt123-default-breadcrumbs.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("      \n");
      out.write("        <style type=\"text/css\">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:\"lucida grande\", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}.fb_link img{border:none}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}.fb_shrink_active{opacity:1;transform:scale(1, 1);transition-duration:200ms;transition-timing-function:ease-out}.fb_shrink_active:active{opacity:.5;transform:scale(.75, .75)}\n");
      out.write("            .fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_reset .fb_dialog_legacy{overflow:visible}.fb_dialog_advanced{padding:10px;-moz-border-radius:8px;-webkit-border-radius:8px;border-radius:8px}.fb_dialog_content{background:#fff;color:#333}.fb_dialog_close_icon{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{top:5px;left:5px;right:auto}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_loader{background-color:#f6f7f9;border:1px solid #606060;font-size:24px;padding:20px}.fb_dialog_top_left,.fb_dialog_top_right,.fb_dialog_bottom_left,.fb_dialog_bottom_right{height:10px;width:10px;overflow:hidden;position:absolute}.fb_dialog_top_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 0;left:-10px;top:-10px}.fb_dialog_top_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -10px;right:-10px;top:-10px}.fb_dialog_bottom_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -20px;bottom:-10px;left:-10px}.fb_dialog_bottom_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -30px;right:-10px;bottom:-10px}.fb_dialog_vert_left,.fb_dialog_vert_right,.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{position:absolute;background:#525252;filter:alpha(opacity=70);opacity:.7}.fb_dialog_vert_left,.fb_dialog_vert_right{width:10px;height:100%}.fb_dialog_vert_left{margin-left:-10px}.fb_dialog_vert_right{right:0;margin-right:-10px}.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{width:100%;height:10px}.fb_dialog_horiz_top{margin-top:-10px}.fb_dialog_horiz_bottom{bottom:0;margin-bottom:-10px}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{-webkit-transform:none;height:100%;margin:0;overflow:visible;position:absolute;top:-10000px;left:0;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{width:auto;height:auto;min-height:initial;min-width:initial;background:none}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{color:#fff;display:block;padding-top:20px;clear:both;font-size:18px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .45);position:absolute;bottom:0;left:0;right:0;top:0;width:100%;min-height:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_content .dialog_header{-webkit-box-shadow:white 0 1px 1px -1px inset;background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#738ABA), to(#2C4987));border-bottom:1px solid;border-color:#1d4088;color:#fff;font:14px Helvetica, sans-serif;font-weight:bold;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{-webkit-font-smoothing:subpixel-antialiased;height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4966A6), color-stop(.5, #355492), to(#2A4887));border:1px solid #29487d;-webkit-background-clip:padding-box;-webkit-border-radius:3px;-webkit-box-shadow:rgba(0, 0, 0, .117188) 0 1px 1px inset, rgba(255, 255, 255, .167969) 0 1px 0;display:inline-block;margin-top:3px;max-width:85px;line-height:18px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{border:none;background:none;color:#fff;font:12px Helvetica, sans-serif;font-weight:bold;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #555;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f6f7f9;border:1px solid #555;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_button{text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-repeat:no-repeat;background-position:50% 50%;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}\n");
      out.write("            .fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_hide_iframes iframe{position:relative;left:-10000px}.fb_iframe_widget_loader{position:relative;display:inline-block}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}.fb_iframe_widget_loader iframe{min-height:32px;z-index:2;zoom:1}.fb_iframe_widget_loader .FB_Loader{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat;height:32px;width:32px;margin-left:-16px;position:absolute;left:50%;z-index:4}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"home blog loaded ready\" data-user=\"0\">\n");
      out.write("\n");
      out.write("        ");
 
            PhongTroDAO dAO = new PhongTroDAO();
            int pages = 1;
            int total = 0;
            String area = "";
            int priceRange = 9;
            int firstResult, EndResult;
            
            if (request.getParameter("pages") != null){
                pages = Integer.parseInt(request.getParameter("pages"));
            }
            
            if (request.getParameter("area") != null){
                area = request.getParameter("area");
            }
            
            if (request.getParameter("priceRange") != null){
                priceRange = Integer.parseInt(request.getParameter("priceRange"));
            } 
            
            
            total = dAO.countPhongTroByFilter(area, priceRange);

            if (total <= 3) {
                firstResult = 0;
                EndResult = total;
            } else {
                
                firstResult = (pages - 1) * 3;
                EndResult = 3;
            }
            
            ArrayList<PhongTro> listPhongTro = dAO.getListPhongTroByNav(area, priceRange, firstResult, EndResult);
        
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"mm-menu mm-offcanvas mm-right mm-hasnavbar-top-1 mm-hasnavbar-bottom-1 mm-listview-huge mm-fx-panels-slide-100 mm-fx-listitems-slide mm-fx-menu-slide mm-border-offset\" id=\"mobile_mmenu\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"mm-navbars-top\">\n");
      out.write("                <div class=\"mm-navbar mm-navbar-size-1\">\n");
      out.write("                    <div class=\"account_wrapper not_login clearfix\">\n");
      out.write("                        <div class=\"left\"><a class=\"link_register\" href=\"https://phongtro123.com/dang-ky-tai-khoan\"><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i> Đăng ký</a></div>\n");
      out.write("                        <div class=\"right\"><a class=\"link_login\" href=\"https://phongtro123.com/dang-nhap-tai-khoan?ref=aHR0cHM6Ly9waG9uZ3RybzEyMy5jb20=\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> Đăng nhập</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"mm-navbars-bottom\">\n");
      out.write("                <div class=\"mm-navbar mm-navbar-size-1 mm-navbar-content-2\"><a class=\"mmenu_bottom_btn_addnew\" href=\"https://phongtro123.com/dang-tin\"><i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i><span>Đăng tin mới</span></a><a class=\"mmenu_bottom_btn_addfund\" href=\"https://phongtro123.com/nap-tien-vao-tai-khoan\"><i class=\"fa fa-usd\" aria-hidden=\"true\"></i><span>Nạp tiền</span></a></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"mm-page mm-slideout\" id=\"mm-0\">\n");
      out.write("            <div class=\" fb_reset\" id=\"fb-root\">\n");
      out.write("                <div style=\"position: absolute; top: -10000px; height: 0px; width: 0px;\">\n");
      out.write("                    <div></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"webpage\">\n");
      out.write("                <!-- Navbar top -->\n");
      out.write("                <div class=\"clearfix\" id=\"navbarTop\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12 col-xs-12 clearfix\">\n");
      out.write("                                <div class=\"user_welcome\">\n");
      out.write("                                    <a class=\"link user_register_link\" href=\"dangbai.jsp\" rel=\"nofollow\"><i></i> Đăng bài</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- / Navbar top -->\n");
      out.write("                <!-- Header -->\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"container clearfix\" id=\"header\">\n");
      out.write("                        <div class=\"header_left\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header_right\">\n");
      out.write("                            <div class=\"show_mobile\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("                <!-- / Header -->\n");
      out.write("                <div class=\"show_mobile\" id=\"mobile_navbar\">\n");
      out.write("                    <div class=\"search_btn_mobile_navbar\">\n");
      out.write("                        <div class=\"inner\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i><span>Tìm kiếm</span></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"show_mobile\" id=\"mobile_navbar_top\">\n");
      out.write("                </div>\n");
      out.write("                <!-- Menu for desktop -->\n");
      out.write("                <div class=\"show_desktop\" id=\"menu\">\n");
      out.write("                    <nav class=\"navbar\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div>\n");
      out.write("                                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                                <div class=\"navbar_collapse_custom\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                                    <div class=\"button_close_menu\">×</div>\n");
      out.write("                                    <div class=\"menu-main-menu-container\">\n");
      out.write("                                        <ul class=\"container-menu\" id=\"menu-main-menu\">\n");
      out.write("\n");
      out.write("                                            <li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-92649\" id=\"menu-item-92649\"><a ><span>Cho thuê phòng trọ</span></a></li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.navbar-collapse -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <!-- / Menu for desktop -->\n");
      out.write("\n");
      out.write("                <div class=\"hidden-xs\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div id=\"searchbar\" style=\"padding-top: 0px;\">\n");
      out.write("                            <form class=\"searchform\" id=\"searchformTop\" role=\"search\" action=\"index.jsp?pages=");
      out.print(pages);
      out.write("\" method=\"GET\">\n");
      out.write("                                <div class=\"search_title\">Lọc tin nhanh</div>\n");
      out.write("                                <div class=\"search_field\">\n");
      out.write("                                    <div class=\"clearfix\" style=\"top: 0px; padding-top: 1px;\">\n");
      out.write("\n");
      out.write("                                            <div class=\"search_field_item search_field_item_quanhuyen\" style=\"margin-top: 5px\">\n");
      out.write("                                             <label class=\"search_field_item_label\">Quận huyện</label>\n");
      out.write("                                                <select name=\"area\"  tabindex=\"-1\"  aria-hidden=\"true\" data-current=\"\">\n");
      out.write("                                                    <option value=\"quan1\">Quận 1</option>\n");
      out.write("                                                    <option value=\"quan2\">Quận 2</option>\n");
      out.write("                                                    <option value=\"quan3\">Quận 3</option>\n");
      out.write("                                                    <option value=\"quan4\">Quận 4</option>\n");
      out.write("                                                    <option value=\"quan5\">Quận 5</option>\n");
      out.write("                                                    <option value=\"quan6\">Quận 6</option>\n");
      out.write("                                                    <option value=\"quan7\">Quận 7</option>\n");
      out.write("                                                    <option value=\"quan8\">Quận 8</option>\n");
      out.write("                                                    <option value=\"quan9\">Quận 9</option>\n");
      out.write("                                                    <option value=\"tatca\" selected=\"true\">Tất cả</option>\n");
      out.write("                                            </select>\n");
      out.write("                                            <!--<span class=\"select2 select2-container select2-container--default\" style=\"width: 142px;\" dir=\"ltr\"><span class=\"selection\"><span tabindex=\"0\" class=\"select2-selection select2-selection--single\" role=\"combobox\" aria-expanded=\"false\" aria-haspopup=\"true\" aria-labelledby=\"select2-quan-kc-container\"><span title=\"Tất cả\" class=\"select2-selection__rendered\" id=\"select2-quan-kc-container\">Tất cả</span><span class=\"select2-selection__arrow\" role=\"presentation\"><b role=\"presentation\"></b></span></span></span><span class=\"dropdown-wrapper\" aria-hidden=\"true\"></span></span>-->\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"search_field_item search_field_item_mucgia\" style=\"margin-top: 5px\">\n");
      out.write("                                                <label class=\"search_field_item_label\">Khoảng giá</label>\n");
      out.write("                                                <select name=\"priceRange\" tabindex=\"-1\" class=\"\" aria-hidden=\"true\">\n");
      out.write("                                                    <!--<option selected=\"selected\" value=\"0\">Chọn mức giá</option>-->\n");
      out.write("                                                    <option value=\"1\">Dưới 1 triệu</option>\n");
      out.write("                                                    <option value=\"2\">1 triệu - 2 triệu</option>\n");
      out.write("                                                    <option value=\"3\">2 triệu - 3 triệu</option>\n");
      out.write("                                                    <option value=\"4\">3 triệu - 4 triệu</option>\n");
      out.write("                                                    <option value=\"5\">4 triệu - 5 triệu</option>\n");
      out.write("                                                    <option value=\"6\">5 triệu - 6 triệu</option>\n");
      out.write("                                                    <option value=\"7\">6 triệu - 7 triệu</option>\n");
      out.write("                                                    <option value=\"8\">Trên 7triệu</option>\n");
      out.write("                                                    <option value=\"9\" selected=\"true\">Tất cả</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            <!--<span class=\"select2 select2-container select2-container--default\" style=\"width: 142px;\" dir=\"ltr\"><span class=\"selection\"><span tabindex=\"0\" class=\"select2-selection select2-selection--single\" role=\"combobox\" aria-expanded=\"false\" aria-haspopup=\"true\" aria-labelledby=\"select2-price-rh-container\"><span title=\"Chọn mức giá\" class=\"select2-selection__rendered\" id=\"select2-price-rh-container\">Chọn mức giá</span><span class=\"select2-selection__arrow\" role=\"presentation\"><b role=\"presentation\"></b></span></span></span><span class=\"dropdown-wrapper\" aria-hidden=\"true\"></span></span>-->\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"search_field_item search_field_item_submit\">\n");
      out.write("                                                <label class=\"search_field_item_label\">&nbsp;</label>\n");
      out.write("                                                <button class=\"btn btn-default btn_search_box\" type=\"submit\"><i aria-hidden=\"true\"></i> Lọc tin</button>\n");
      out.write("                                            </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"page_view_wrapper clearfix\">\n");
      out.write("                        <!-- Left content -->\n");
      out.write("                        <div class=\"block-left\">\n");
      out.write("                            <!-- wrapper -->\n");
      out.write("                            <div class=\"wrapper\">\n");
      out.write("                                <!-- Danh sách tin -->\n");
      out.write("                                <ul class=\"list-post\">\n");
      out.write("                                    ");
 for(PhongTro phongTro : listPhongTro){ 
      out.write("\n");
      out.write("\n");
      out.write("                                    <li class=\"post-item a clearfix tin-vip vipnoibat post-124753 post type-post status-publish format-standard has-post-thumbnail hentry category-ho-chi-minh category-quan-11 tag-can-ho\" id=\"post-124753\" itemtype=\"http://schema.org/SingleFamilyResidence\" itemscope=\"\">\n");
      out.write("\n");
      out.write("                                        <div class=\"post-left\">\n");
      out.write("                                            <div class=\"post-thumb-wrapper\">\n");
      out.write("                                                <div class=\"post-thumb\" style=\"background: center no-repeat; background-size: cover;\">\n");
      out.write("                                                    <img src=\"");
      out.print(phongTro.getImage());
      out.write("\" />\n");
      out.write("                                                    <a title=\"");
      out.print(phongTro.getTitle());
      out.write("\" class=\"post-link\" href=\"chitiet.jsp?phongTroID=");
      out.print(phongTro.getId());
      out.write("\" alt=\"");
      out.print(phongTro.getTitle());
      out.write("\"></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"post_info clearfix\">\n");
      out.write("                                                <a title=\"");
      out.print(phongTro.getTitle());
      out.write("\" class=\"post-link\" href=\"chitiet.jsp?phongTroID=");
      out.print(phongTro.getId());
      out.write("\" alt=\"");
      out.print(phongTro.getTitle());
      out.write("\">\n");
      out.write("                                                    <span class=\"post-title\">");
      out.print(phongTro.getTitle());
      out.write("</span>\n");
      out.write("                                                </a>\n");
      out.write("                                                    <p class=\"p_content\">");
      out.print(phongTro.getSubContent());
      out.write("</p>\n");
      out.write("                                                <div class=\"p_content_2\">\n");
      out.write("                                                    <div class=\"p_content_left\">\n");
      out.write("                                                        <span class=\"post-meta address\">Khu vực: <strong><a title=\"");
      out.print(phongTro.getArea());
      out.write("\" href=\"https://phongtro123.com/tinh-thanh/ho-chi-minh/quan-11\">");
      out.print(phongTro.getArea());
      out.write("</a></strong></span>\n");
      out.write("                                                        <!--span class=\"post-meta address\">Khu vực: <strong>Quận 11, Hồ Chí Minh</strong></span-->\n");
      out.write("                                                        <span class=\"post-meta price\">Giá: <strong>");
      out.print(phongTro.getPrice());
      out.write("/tháng</strong></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                                <!-- / Danh sách tin -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- / wrapper -->\n");
      out.write("                            <div class=\"clearfix\">\n");
      out.write("                                <div class=\"page_navigation\">\n");
      out.write("                                    <div class=\"custom-pagination\">\n");
      out.write("                                        ");
 for(int i=1; i<= (total/3) + 1; i++) { 
      out.write("\n");
      out.write("                                            ");
 if (i == pages){ 
      out.write("\n");
      out.write("                                                <span class=\"page-numbers current\"><span class=\"paging\">");
      out.print(i);
      out.write("</span></span>\n");
      out.write("                                            ");
 }else { 
      out.write("\n");
      out.write("                                                <a class=\"page-numbers\" href=\"index.jsp?pages=");
      out.print(i);
      out.write("&area=");
      out.print(area);
      out.write("&priceRange=");
      out.print(priceRange);
      out.write("\"><span class=\"paging\">");
      out.print(i);
      out.write("</span></a>\n");
      out.write("                                            ");
}
                                        }
      out.write("\n");
      out.write("\n");
      out.write("                                        <a class=\"next page-numbers\" href=\"index.jsp?pages=");
      out.print((pages +1));
      out.write("\">Trang tiếp</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- / Main content -->\n");
      out.write("                <div class=\"hidden-xs\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div tabindex=\"-1\" class=\"modal modal_thongbao fade b\" id=\"modal_thongbao\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button class=\"close\" aria-label=\"Close\" type=\"button\" data-dismiss=\"modal\"><span aria-hidden=\"true\">×</span></button>\n");
      out.write("                            <h4 class=\"modal-title\">Thông báo</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <p>Nội dung thông báo</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button class=\"btn btn-default\" type=\"button\" data-dismiss=\"modal\">Đóng</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.modal-content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.modal-dialog -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"scrollToTop\" style=\"display: none;\">Scroll To Top</div>\n");
      out.write("            <div class=\"show_desktop\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"zs\" id=\"app\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mm-slideout\" id=\"mm-blocker\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
