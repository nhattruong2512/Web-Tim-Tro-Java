package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangbai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"user_active\" lang=\"en-US\" ><!--<![endif]--><head><style type=\"text/css\">.gm-style .gm-style-mtc label,.gm-style .gm-style-mtc div{font-weight:400}\n");
      out.write("        </style><style type=\"text/css\">.gm-style .gm-style-cc span,.gm-style .gm-style-cc a,.gm-style .gm-style-mtc div{font-size:10px}\n");
      out.write("        </style><style type=\"text/css\">@media print {  .gm-style .gmnoprint, .gmnoprint {    display:none  }}@media screen {  .gm-style .gmnoscreen, .gmnoscreen {    display:none  }}</style><style type=\"text/css\">.gm-style-pbc{transition:opacity ease-in-out;background-color:rgba(0,0,0,0.45);text-align:center}.gm-style-pbt{font-size:22px;color:white;font-family:Roboto,Arial,sans-serif;position:relative;margin:0;top:50%;-webkit-transform:translateY(-50%);-ms-transform:translateY(-50%);transform:translateY(-50%)}\n");
      out.write("        </style>\n");
      out.write("        <meta name=\"google-site-verification\" content=\"tSsMrq71kipW3OwGk4GvTRrBIrXc2jGBgt0mCXLEkEA\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta content=\"1748349635396853\" property=\"fb:app_id\">\n");
      out.write("        <title>Đăng tin</title>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/toastr.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/jquery.bxslider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/select2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/jquery.mmenu.all.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.min.24.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/fonts.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <meta content=\"article\" property=\"og:type\">\n");
      out.write("        <meta content=\"Đăng tin\" property=\"og:title\">\n");
      out.write("        <meta content=\"2014-07-23\" property=\"article:published_time\">\n");
      out.write("        <meta content=\"2017-07-10\" property=\"article:modified_time\">\n");
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
      out.write("        <link id=\"wpfp-css\" href=\"c/wpfp.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link id=\"contact-form-7-css\" href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link id=\"breadcrumbs-styles-css\" href=\"css/pt123-default-breadcrumbs.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-migrate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            var constant = {\"price_vip_noi_bat\": \"50\", \"price_super_vip\": \"20\", \"price_vip\": \"15\", \"price_normal\": \"10\", \"price_normal2\": \"1\", \"price_reup_vipnoibat\": \"5\", \"price_reup_super_vip\": \"3\", \"price_reup_vip\": \"2\", \"price_reup_normal\": \"2\"}</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"page-template page-template-page-templates page-template-page-dang-tin-20160307 page-template-page-templatespage-dang-tin-20160307-php page page-id-14 logged-in loaded ready\" data-user=\"46945 --- 01699726625 --- nhattruong251295@gmail.com\"><nav class=\"mm-menu mm-offcanvas mm-hasnavbar-top-1 mm-hasnavbar-bottom-1 mm-listview-huge mm-fx-panels-slide-100 mm-fx-listitems-slide mm-fx-menu-slide mm-border-offset\" id=\"mobile_mmenu\" aria-hidden=\"true\"><div class=\"mm-navbars-top\"><div class=\"mm-navbar mm-navbar-size-1\"><div class=\"account_wrapper clearfix\"><div class=\"meta\"><div class=\"dropdown\"><button class=\"btn btn-user-name dropdown-toggle\" id=\"dropdown_user_menu_mobile\" aria-expanded=\"true\" aria-haspopup=\"true\" type=\"button\" data-toggle=\"dropdown\">Quản lý tài khoản <strong>nhattruong251295@gmail.com</strong> <span class=\"caret\"></span></button><ul class=\"dropdown-menu\" aria-labelledby=\"dropdown_user_menu_mobile\"><li><span>Mã tài khoản: <strong>46945</strong></span></li><li><span>Số dư cuối: <strong>10,000 VNĐ</strong></span></li><li><a href=\"https://phongtro123.com/quan-ly-tin-dang\"><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i> Quản lý tin đăng</a></li><li><a href=\"https://phongtro123.com/lich-su-giao-dich\"><i class=\"fa fa-history\" aria-hidden=\"true\"></i> Lịch sử giao dịch</a></li><li><a href=\"https://phongtro123.com/thong-tin-ca-nhan\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Cập nhật thông tin cá nhân</a></li><li><a href=\"https://phongtro123.com/nap-tien-vao-tai-khoan\"><i class=\"fa fa-usd\" aria-hidden=\"true\"></i> Nạp tiền</a></li><li><a href=\"https://phongtro123.com/wp-login.php?action=logout&amp;redirect_to=https%3A%2F%2Fphongtro123.com&amp;_wpnonce=cc440ac555\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Đăng xuất tài khoản</a></li></ul></div></div></div></div></div><div class=\"mm-panels\"><div class=\"mm-panel mm-hasnavbar mm-opened\" id=\"mm-1\"><div class=\"mm-navbar\"><a class=\"mm-title\">PHONGTRO123.COM</a></div><ul class=\"mm-listview\">\n");
      out.write("\n");
      out.write("                    </ul></div></div>\n");
      out.write("\n");
      out.write("            <div class=\"mm-navbars-bottom\"><div class=\"mm-navbar mm-navbar-size-1 mm-navbar-content-2\"><a class=\"mmenu_bottom_btn_addnew\" href=\"https://phongtro123.com/dang-tin\"><i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i><span>Đăng tin mới</span></a><a class=\"mmenu_bottom_btn_addfund\" href=\"https://phongtro123.com/nap-tien-vao-tai-khoan\"><i class=\"fa fa-usd\" aria-hidden=\"true\"></i><span>Nạp tiền</span></a></div></div></nav>\n");
      out.write("\n");
      out.write("        <div class=\"mm-page mm-slideout\" id=\"mm-0\"><div class=\" fb_reset\" id=\"fb-root\"><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div></div></div><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div><iframe name=\"fb_xdm_frame_https\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_https\" aria-hidden=\"true\" src=\"https://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f25544ca427047c&amp;origin=https%3A%2F%2Fphongtro123.com\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe></div></div></div><div class=\"webpage\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"show_mobile\" id=\"mobile_navbar\">\n");
      out.write("                    <div class=\"search_btn_mobile_navbar\"><div class=\"inner\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i><span>Tìm kiếm</span></div></div>\n");
      out.write("                    <div class=\"hamburger_btn_mobile_navbar\"><a href=\"#mobile_mmenu\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i><span>Danh mục</span></a></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"hidden-lg hidden-sm\">\n");
      out.write("                    <!-- Banner 728x90 -->\n");
      out.write("\n");
      out.write("                    <div class=\"ad-728-90\" style=\"width: 100%; height: 90px; margin-top: 10px; margin-bottom: 10px;\">\n");
      out.write("\n");
      out.write("                        <ins class=\"adsbygoogle\" style=\"display:block\" data-adsbygoogle-status=\"done\" data-ad-client=\"ca-pub-1713423796088709\" data-ad-slot=\"7864976686\" data-ad-format=\"auto\"></ins>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <div class=\"page_view_wrapper clearfix\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Left content -->\n");
      out.write("                        <div class=\"block-left dang_tin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"dang_tin_wrapper clearfix\">\t\t\t\t\n");
      out.write("                                <form class=\"form\" id=\"frm-dangtin\" enctype=\"multipart/form-data\" method=\"POST\" novalidate=\"novalidate\" action=\"UploadServlet\">\n");
      out.write("                                    <div class=\"wrapper form_step step1\">\n");
      out.write("\n");
      out.write("                                        <div class=\"group_fields\">\n");
      out.write("\n");
      out.write("                                            <h3 class=\"form_title\">Thông tin cơ bản</h3>\n");
      out.write("\n");
      out.write("                                            <div class=\"group_fields_body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-12\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"tieude\">Tiêu đề tin <span class=\"red_require\">(*) </span></label>\n");
      out.write("                                                            <input name=\"tieude\" class=\"form-control\" id=\"tieude\" aria-required=\"true\" required=\"\" type=\"text\" maxlength=\"150\" placeholder=\"Hãy đặt tiêu đề đầy đủ nghĩa, khách sẽ quan tâm hơn\" minlength=\"40\" >\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                                                        <div class=\"col-sm-6 col-xs-12\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"sodienthoai\">Số điện thoại <span class=\"red_require\">(*)</span></label>\n");
      out.write("                                                            <input name=\"sodienthoai\" class=\"form-control disabled\" id=\"sodienthoai\" aria-required=\"true\" required=\"\" type=\"number\" placeholder=\"Nhập đúng số điện thoại để tiện cho khách liên hệ\" >\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"giachothue\">Email <span class=\"red_require\">(*)</span></label>\n");
      out.write("                                                            <input name=\"email\" class=\"form-control\" id=\"giachothue\" aria-required=\"true\" required=\"\" type=\"text\" min=\"1\" placeholder=\"abc@phongtro.com\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" id=\"text_giachothue\" for=\"text_email\"></label>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"giachothue\">Giá cho thuê <span class=\"red_require\">(*)</span></label>\n");
      out.write("                                                            <input name=\"giachothue\" class=\"form-control\" id=\"giachothue\" aria-required=\"true\" required=\"\" type=\"number\" min=\"1\" placeholder=\"Giá cho thuê (VNĐ)\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" id=\"text_giachothue\" for=\"text_giachothue\"></label>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"group_fields\">\n");
      out.write("\n");
      out.write("                                            <h3 class=\"form_title\">Địa chỉ</h3>\n");
      out.write("\n");
      out.write("                                            <div class=\"group_fields_body\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                                                        <div class=\"col-sm-6 col-xs-12\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"quanhuyen\">Quận huyện <span class=\"red_require\">(*)</span></label>\n");
      out.write("                                                            <select name=\"quanhuyen\" class=\"form-control\" id=\"quanhuyen\" aria-required=\"true\" required=\"\">\n");
      out.write("                                                                <option value=\"quan1\">Quận 1</option>\n");
      out.write("                                                                <option value=\"quan2\">Quận 2</option>\n");
      out.write("                                                                <option value=\"quan3\">Quận 3</option>\n");
      out.write("                                                                <option value=\"quan4\">Quận 4</option>\n");
      out.write("                                                                <option value=\"quan5\">Quận 5</option>\n");
      out.write("                                                                <option value=\"quan6\">Quận 6</option>\n");
      out.write("                                                                <option value=\"quan7\">Quận 7</option>\n");
      out.write("                                                                <option value=\"quan8\">Quận 8</option>\n");
      out.write("                                                                <option value=\"quan9\">Quận 9</option>\n");
      out.write("                                                            </select>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-12\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"diachi\">Địa chỉ chính xác <span class=\"red_require\">(*)</span></label>\n");
      out.write("                                                            <input name=\"diachi\" class=\"form-control\" id=\"diachi\" aria-required=\"true\" required=\"\" type=\"text\" placeholder=\"Hãy nhập địa chỉ chính xác để khách dễ tìm hơn\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"group_fields\">\n");
      out.write("\n");
      out.write("                                            <h3 class=\"form_title\">Thông tin mô tả</h3>\n");
      out.write("                                            <div class=\"group_fields_body\">\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-12\">\n");
      out.write("                                                            <label class=\"col-sm-12 control-label\" for=\"noidung\">Nội dung <span class=\"red_require\">(*)</span></label>\n");
      out.write("                                                            <textarea name=\"noidung\" class=\"form-control edtior-noidung\" id=\"noidung_text\" aria-required=\"true\" required=\"\" rows=\"5\"></textarea>\n");
      out.write("                                                            <input id=\"noidung_html\" type=\"hidden\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"group_fields\">\n");
      out.write("                                            <h3 class=\"form_title\">Hình ảnh</h3>\n");
      out.write("                                                        <p style=\"margin: 10px 0; font-size: 16px; font-weight: 600\">Select file to upload:</p>\n");
      out.write("                                                <input type=\"file\" name=\"uploadFile\" />\n");
      out.write("                                                        <br/><br/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"error-message hidden\">\n");
      out.write("                                                <div class=\"error-message-content\"></div>\n");
      out.write("                                                <div class=\"error-message-close\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12\">\n");
      out.write("                                                <input name=\"action\" type=\"hidden\" value=\"custom_posted_post\">\n");
      out.write("                                                <input name=\"file_remove\" type=\"hidden\" value=\"\">\n");
      out.write("                                                <input name=\"post_id\" id=\"post_id\" type=\"hidden\" value=\"\">\n");
      out.write("                                                <input name=\"file_reuploaded\" id=\"file_reuploaded\" type=\"hidden\">\n");
      out.write("                                                <input name=\"map_lat\" id=\"map_lat\" type=\"hidden\" value=\"\">\n");
      out.write("                                                <input name=\"map_long\" id=\"map_long\" type=\"hidden\" value=\"\">\n");
      out.write("                                                <input name=\"image\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imgName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input class=\"\" type=\"submit\" value=\"Đăng tin ngay\" style=\"background: orange; width: dp; color: #ffffff\"/>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- / Main content -->\n");
      out.write("\n");
      out.write("                <div class=\"notification alert alert-success\">\n");
      out.write("                    <div class=\"container\"><strong>Bạn đã đăng tin thành công!</strong> Bạn sẽ chuyển được đến trang quản lý tin ngay bây giờ.</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"show_desktop\">\n");
      out.write("                    <div class=\"keyword\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mm-slideout\" id=\"mm-blocker\"></div><div class=\"zs\" id=\"app\"></div><iframe name=\"oauth2relay252458911\" tabindex=\"-1\" id=\"oauth2relay252458911\" aria-hidden=\"true\" src=\"https://accounts.google.com/o/oauth2/postmessageRelay?parent=https%3A%2F%2Fphongtro123.com&amp;jsh=m%3B%2F_%2Fscs%2Fapps-static%2F_%2Fjs%2Fk%3Doz.gapi.vi.1msrqdebRs0.O%2Fm%3D__features__%2Fam%3DAQ%2Frt%3Dj%2Fd%3D1%2Frs%3DAGLTcCNRhW5gld3J5IoPhgriqcjg3YPGcA#rpctoken=698789604&amp;forcesecure=1\" style=\"top: -100px; width: 1px; height: 1px; position: absolute;\"></iframe>\n");
      out.write("                <div class=\" fb_reset\" id=\"fb-root\"><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div><iframe name=\"fb_xdm_frame_http\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_http\" aria-hidden=\"true\" src=\"http://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f5fac788634a98&amp;origin=http%3A%2F%2Flocalhost%3A8888\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe><iframe name=\"fb_xdm_frame_https\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_https\" aria-hidden=\"true\" src=\"https://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f5fac788634a98&amp;origin=http%3A%2F%2Flocalhost%3A8888\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe></div></div><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div></div></div></div><div class=\"zs\" id=\"app\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\" fb_reset\" id=\"fb-root\"><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div><iframe name=\"fb_xdm_frame_http\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_http\" aria-hidden=\"true\" src=\"http://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f3005c442ec3ac8&amp;origin=http%3A%2F%2Flocalhost%3A8888\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe><iframe name=\"fb_xdm_frame_https\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_https\" aria-hidden=\"true\" src=\"https://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f3005c442ec3ac8&amp;origin=http%3A%2F%2Flocalhost%3A8888\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe></div></div><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div></div></div></div><div class=\"zs\" id=\"app\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\" fb_reset\" id=\"fb-root\"><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div><iframe name=\"fb_xdm_frame_http\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_http\" aria-hidden=\"true\" src=\"http://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f1600e2183cffd8&amp;origin=http%3A%2F%2Flocalhost%3A8888\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe><iframe name=\"fb_xdm_frame_https\" tabindex=\"-1\" title=\"Facebook Cross Domain Communication Frame\" id=\"fb_xdm_frame_https\" aria-hidden=\"true\" src=\"https://staticxx.facebook.com/connect/xd_arbiter/r/18W0fzbK7xg.js?version=42#channel=f1600e2183cffd8&amp;origin=http%3A%2F%2Flocalhost%3A8888\" frameborder=\"0\" scrolling=\"no\" allowfullscreen=\"true\" style=\"border: medium; border-image: none;\" allowtransparency=\"true\"></iframe></div></div><div style=\"top: -10000px; width: 0px; height: 0px; position: absolute;\"><div></div></div></div><div class=\"zs\" id=\"app\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </body>\n");
      out.write("                <script src=\"js/app.js\"></script>\n");
      out.write("\n");
      out.write("                </html>");
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
