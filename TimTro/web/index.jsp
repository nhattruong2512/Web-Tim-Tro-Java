<%@page import="java.util.ArrayList"%>
<%@page import="model.PhongTro"%>
<%@page import="dao.PhongTroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en-US" prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# article: http://ogp.me/ns/article#"><!--<![endif]--><head>
        <meta name="google-site-verification" content="tSsMrq71kipW3OwGk4GvTRrBIrXc2jGBgt0mCXLEkEA">
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta content="1748349635396853" property="fb:app_id">
        <title>Cho thuê phòng trọ nhà trọ, tìm phòng trọ</title>
        <link href="http://gmpg.org/xfn/11" rel="profile">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/toastr.min.css" rel="stylesheet">
        <link href="css/jquery.bxslider.css" rel="stylesheet">
        <link href="css/flexslider.css" rel="stylesheet">
        <link href="css/select2.min.css" rel="stylesheet">
        <link href="css/jquery.mmenu.all.css" rel="stylesheet">
        <link href="css/style.min.20170814.css?v=23" rel="stylesheet">
        <link href="css/phongtro.tablet.css?v=23" rel="stylesheet">
        <link href="css/phongtro.mobile.css?v=23" rel="stylesheet">
        <link href="css/fonts.min.css" rel="stylesheet">
        <!--<meta content="https://phongtro123.com/wp-content/themes/phongtro123/images/phongtro123_share.jpg" property="og:image">-->

        <meta name="description" content="Cho thuê phòng trọ, nhà trọ số 1 Việt Nam - Website đăng tin cho thuê phòng trọ, tìm phòng trọ nhanh, hiệu quả với hơn 70.000+ tin đăng và 2.000.000 lượt xem mõi tháng.">
        <meta name="keywords" content="cho thuê,phòng trọ,nhà trọ,tìm phòng trọ,thuê phòng trọ">
        <meta content="blog" property="og:type">
        <meta content="Cho thuê phòng trọ nhà trọ, tìm phòng trọ" property="og:title">
        <meta content="Kênh cho thuê phòng trọ, nhà trọ, tìm phòng trọ nhanh và hiệu quả nhất" property="og:description">
        <meta content="Cho thuê phòng trọ nhà trọ, tìm phòng trọ" property="og:site_name">
        <meta name="twitter:card" content="summary">
        <!-- /SEO Ultimate -->
        <link href="//s.w.org" rel="dns-prefetch">

        <style type="text/css">
            img.wp-smiley,
            img.emoji {
                display: inline !important;
                border: none !important;
                box-shadow: none !important;
                height: 1em !important;
                width: 1em !important;
                margin: 0 .07em !important;
                vertical-align: -0.1em !important;
                background: none !important;
                padding: 0 !important;
            }
        </style>
        <link id="wpfp-css" href="css/wpfp.css" rel="stylesheet" type="text/css">
        <link id="contact-form-7-css" href="css/styles.css" rel="stylesheet" type="text/css" media="all">
        <link id="breadcrumbs-styles-css" href="css/pt123-default-breadcrumbs.css" rel="stylesheet" type="text/css" media="all">
        <script type="text/javascript">
            /* <![CDATA[ */
            var get_district_ajax = {"ajaxurl": "https:\/\/phongtro123.com\/wp-admin\/admin-ajax.php"};
            /* ]]> */
        </script>
        <script type="text/javascript">
            var constant = {"price_vip_noi_bat": "50", "price_super_vip": "20", "price_vip": "15", "price_normal": "10", "price_normal2": "1", "price_reup_vipnoibat": "5", "price_reup_super_vip": "3", "price_reup_vip": "2", "price_reup_normal": "2"}
        </script>
        <script type="text/javascript">
            base_url = 'https://phongtro123.com/';
            register_url = 'https://phongtro123.com/dang-ky-tai-khoan';
            login_url = 'https://phongtro123.com/dang-nhap-tai-khoan?ref=aHR0cHM6Ly9waG9uZ3RybzEyMy5jb20=';
            logout_url = 'https://phongtro123.com/wp-login.php?action=logout&amp;redirect_to=https%3A%2F%2Fphongtro123.com&amp;_wpnonce=129bc41421';
            user_payment_addfund_url = 'https://phongtro123.com/nap-tien-vao-tai-khoan';
            page_tindaluu_url = 'https://phongtro123.com/tin-da-luu';
            page_edit_profile_url = 'https://phongtro123.com/thong-tin-ca-nhan';
            page_history_transaction_url = 'https://phongtro123.com/lich-su-giao-dich';
            page_my_post_url = 'https://phongtro123.com/quan-ly-tin-dang';
            page_add_post_url = 'https://phongtro123.com/dang-tin';
            current_user_id = '0';
            current_user_name = '';
            account_balance = '';
        </script>
        <link href="https://securepubads.g.doubleclick.net/static/3p_cookie.html" rel="prefetch">
        <style type="text/css">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}.fb_link img{border:none}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}.fb_shrink_active{opacity:1;transform:scale(1, 1);transition-duration:200ms;transition-timing-function:ease-out}.fb_shrink_active:active{opacity:.5;transform:scale(.75, .75)}
            .fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_reset .fb_dialog_legacy{overflow:visible}.fb_dialog_advanced{padding:10px;-moz-border-radius:8px;-webkit-border-radius:8px;border-radius:8px}.fb_dialog_content{background:#fff;color:#333}.fb_dialog_close_icon{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{top:5px;left:5px;right:auto}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_loader{background-color:#f6f7f9;border:1px solid #606060;font-size:24px;padding:20px}.fb_dialog_top_left,.fb_dialog_top_right,.fb_dialog_bottom_left,.fb_dialog_bottom_right{height:10px;width:10px;overflow:hidden;position:absolute}.fb_dialog_top_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 0;left:-10px;top:-10px}.fb_dialog_top_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -10px;right:-10px;top:-10px}.fb_dialog_bottom_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -20px;bottom:-10px;left:-10px}.fb_dialog_bottom_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -30px;right:-10px;bottom:-10px}.fb_dialog_vert_left,.fb_dialog_vert_right,.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{position:absolute;background:#525252;filter:alpha(opacity=70);opacity:.7}.fb_dialog_vert_left,.fb_dialog_vert_right{width:10px;height:100%}.fb_dialog_vert_left{margin-left:-10px}.fb_dialog_vert_right{right:0;margin-right:-10px}.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{width:100%;height:10px}.fb_dialog_horiz_top{margin-top:-10px}.fb_dialog_horiz_bottom{bottom:0;margin-bottom:-10px}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{-webkit-transform:none;height:100%;margin:0;overflow:visible;position:absolute;top:-10000px;left:0;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{width:auto;height:auto;min-height:initial;min-width:initial;background:none}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{color:#fff;display:block;padding-top:20px;clear:both;font-size:18px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .45);position:absolute;bottom:0;left:0;right:0;top:0;width:100%;min-height:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_content .dialog_header{-webkit-box-shadow:white 0 1px 1px -1px inset;background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#738ABA), to(#2C4987));border-bottom:1px solid;border-color:#1d4088;color:#fff;font:14px Helvetica, sans-serif;font-weight:bold;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{-webkit-font-smoothing:subpixel-antialiased;height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4966A6), color-stop(.5, #355492), to(#2A4887));border:1px solid #29487d;-webkit-background-clip:padding-box;-webkit-border-radius:3px;-webkit-box-shadow:rgba(0, 0, 0, .117188) 0 1px 1px inset, rgba(255, 255, 255, .167969) 0 1px 0;display:inline-block;margin-top:3px;max-width:85px;line-height:18px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{border:none;background:none;color:#fff;font:12px Helvetica, sans-serif;font-weight:bold;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #555;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f6f7f9;border:1px solid #555;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_button{text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-repeat:no-repeat;background-position:50% 50%;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
            .fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_hide_iframes iframe{position:relative;left:-10000px}.fb_iframe_widget_loader{position:relative;display:inline-block}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}.fb_iframe_widget_loader iframe{min-height:32px;z-index:2;zoom:1}.fb_iframe_widget_loader .FB_Loader{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat;height:32px;width:32px;margin-left:-16px;position:absolute;left:50%;z-index:4}
        </style>

    </head>
    <body class="home blog loaded ready" data-user="0">

        <% 
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
        %>

        <nav class="mm-menu mm-offcanvas mm-right mm-hasnavbar-top-1 mm-hasnavbar-bottom-1 mm-listview-huge mm-fx-panels-slide-100 mm-fx-listitems-slide mm-fx-menu-slide mm-border-offset" id="mobile_mmenu" aria-hidden="true">
            <div class="mm-navbars-top">
                <div class="mm-navbar mm-navbar-size-1">
                    <div class="account_wrapper not_login clearfix">
                        <div class="left"><a class="link_register" href="https://phongtro123.com/dang-ky-tai-khoan"><i class="fa fa-user-plus" aria-hidden="true"></i> Đăng ký</a></div>
                        <div class="right"><a class="link_login" href="https://phongtro123.com/dang-nhap-tai-khoan?ref=aHR0cHM6Ly9waG9uZ3RybzEyMy5jb20="><i class="fa fa-sign-in" aria-hidden="true"></i> Đăng nhập</a></div>
                    </div>
                </div>
            </div>
            
            <div class="mm-navbars-bottom">
                <div class="mm-navbar mm-navbar-size-1 mm-navbar-content-2"><a class="mmenu_bottom_btn_addnew" href="https://phongtro123.com/dang-tin"><i class="fa fa-plus-circle" aria-hidden="true"></i><span>Đăng tin mới</span></a><a class="mmenu_bottom_btn_addfund" href="https://phongtro123.com/nap-tien-vao-tai-khoan"><i class="fa fa-usd" aria-hidden="true"></i><span>Nạp tiền</span></a></div>
            </div>
        </nav>
        <div class="mm-page mm-slideout" id="mm-0">
            <div class=" fb_reset" id="fb-root">
                <div style="position: absolute; top: -10000px; height: 0px; width: 0px;">
                    <div></div>
                </div>
            </div>
            <div class="webpage">
                <!-- Navbar top -->
                <div class="clearfix" id="navbarTop">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-12 col-xs-12 clearfix">
                                <div class="user_welcome">
                                    <a href="https://phongtro123.com/dang-nhap-tai-khoan?ref=aHR0cHM6Ly9waG9uZ3RybzEyMy5jb20=" rel="nofollow"><i></i> Đăng nhập</a>
                                    <a class="link user_register_link" href="https://phongtro123.com/dang-ky-tai-khoan?ref=aHR0cHM6Ly9waG9uZ3RybzEyMy5jb20=" rel="nofollow"><i></i> Đăng ký</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- / Navbar top -->
                <!-- Header -->
                <header>
                    <div class="container clearfix" id="header">
                        <div class="header_left">

                        </div>
                        <div class="header_right">
                            <div class="show_mobile">
                            </div>
                        </div>
                    </div>
                </header>
                <!-- / Header -->
                <div class="show_mobile" id="mobile_navbar">
                    <div class="search_btn_mobile_navbar">
                        <div class="inner"><i class="fa fa-search" aria-hidden="true"></i><span>Tìm kiếm</span></div>
                    </div>
                    <div class="hamburger_btn_mobile_navbar"><a href="#mobile_mmenu"><i class="fa fa-bars" aria-hidden="true"></i><span>Danh mục</span></a></div>
                    <div class="add_new_btn_mobile_navbar"><a href="https://phongtro123.com/dang-tin"><i class="fa fa-plus-circle" aria-hidden="true"></i><span>Đăng tin <i>mới</i></span></a></div>
                    <div class="register_btn_mobile_navbar"><a href="https://phongtro123.com/dang-ky-tai-khoan"><i class="fa fa-user-plus" aria-hidden="true"></i><span>Đăng ký</span></a></div>
                    <div class="login_btn_mobile_navbar"><a href="https://phongtro123.com/dang-nhap-tai-khoan?ref=aHR0cHM6Ly9waG9uZ3RybzEyMy5jb20="><i class="fa fa-sign-in" aria-hidden="true"></i><span>Đăng nhập</span></a></div>
                </div>
                <div class="show_mobile" id="mobile_navbar_top">
                    <div class="mobile_navbar_logo"><a href="https://phongtro123.com"></a></div>
                </div>
                <!-- Menu for desktop -->
                <div class="show_desktop" id="menu">
                    <nav class="navbar">
                        <div class="container">
                            <div>
                                <!-- Collect the nav links, forms, and other content for toggling -->
                                <div class="navbar_collapse_custom" id="bs-example-navbar-collapse-1">
                                    <div class="button_close_menu">×</div>
                                    <div class="menu-main-menu-container">
                                        <ul class="container-menu" id="menu-main-menu">

                                            <li class="menu-item menu-item-type-post_type menu-item-object-page menu-item-92649" id="menu-item-92649"><a href="https://phongtro123.com/cho-thue-phong-tro"><span>Cho thuê phòng trọ</span></a></li>

                                            <li id="post-new"><a class="btn-post-new" href="https://phongtro123.com/dang-tin"><span>Đăng tin</span></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- /.navbar-collapse -->
                            </div>
                        </div>
                        <!-- /.container-fluid -->
                    </nav>
                </div>
                <!-- / Menu for desktop -->

                <div class="hidden-xs">
                    <div class="container">
                        <div id="searchbar" style="padding-top: 0px;">
                            <form class="searchform" id="searchformTop" role="search" action="index.jsp?pages=<%=pages%>" method="GET">
                                <div class="search_title">Lọc tin nhanh</div>
                                <div class="search_field">
                                    <div class="clearfix" style="top: 0px; padding-top: 1px;">

                                            <div class="search_field_item search_field_item_quanhuyen" style="margin-top: 5px">
                                             <label class="search_field_item_label">Quận huyện</label>
                                                <select name="area"  tabindex="-1"  aria-hidden="true" data-current="">
                                                    <option value="quan1">Quận 1</option>
                                                    <option value="quan2">Quận 2</option>
                                                    <option value="quan3">Quận 3</option>
                                                    <option value="quan4">Quận 4</option>
                                                    <option value="quan5">Quận 5</option>
                                                    <option value="quan6">Quận 6</option>
                                                    <option value="quan7">Quận 7</option>
                                                    <option value="quan8">Quận 8</option>
                                                    <option value="quan9">Quận 9</option>
                                                    <option value="tatca" selected="true">Tất cả</option>
                                            </select>
                                            <!--<span class="select2 select2-container select2-container--default" style="width: 142px;" dir="ltr"><span class="selection"><span tabindex="0" class="select2-selection select2-selection--single" role="combobox" aria-expanded="false" aria-haspopup="true" aria-labelledby="select2-quan-kc-container"><span title="Tất cả" class="select2-selection__rendered" id="select2-quan-kc-container">Tất cả</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>-->
                                            </div>

                                            <div class="search_field_item search_field_item_mucgia" style="margin-top: 5px">
                                                <label class="search_field_item_label">Khoảng giá</label>
                                                <select name="priceRange" tabindex="-1" class="" aria-hidden="true">
                                                    <!--<option selected="selected" value="0">Chọn mức giá</option>-->
                                                    <option value="1">Dưới 1 triệu</option>
                                                    <option value="2">1 triệu - 2 triệu</option>
                                                    <option value="3">2 triệu - 3 triệu</option>
                                                    <option value="4">3 triệu - 4 triệu</option>
                                                    <option value="5">4 triệu - 5 triệu</option>
                                                    <option value="6">5 triệu - 6 triệu</option>
                                                    <option value="7">6 triệu - 7 triệu</option>
                                                    <option value="8">Trên 7triệu</option>
                                                    <option value="9" selected="true">Tất cả</option>
                                                </select>
                                            <!--<span class="select2 select2-container select2-container--default" style="width: 142px;" dir="ltr"><span class="selection"><span tabindex="0" class="select2-selection select2-selection--single" role="combobox" aria-expanded="false" aria-haspopup="true" aria-labelledby="select2-price-rh-container"><span title="Chọn mức giá" class="select2-selection__rendered" id="select2-price-rh-container">Chọn mức giá</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>-->
                                            </div>
                                            
                                            <div class="search_field_item search_field_item_submit">
                                                <label class="search_field_item_label">&nbsp;</label>
                                                <button class="btn btn-default btn_search_box" type="submit"><i aria-hidden="true"></i> Lọc tin</button>
                                            </div>
                                    </div>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>

                <!-- Main content -->
                <div class="container">
                    <div class="page_view_wrapper clearfix">
                        <!-- Left content -->
                        <div class="block-left">
                            <!-- wrapper -->
                            <div class="wrapper">
                                <!-- Danh sách tin -->
                                <ul class="list-post">
                                    <% for(PhongTro phongTro : listPhongTro){ %>

                                    <li class="post-item a clearfix tin-vip vipnoibat post-124753 post type-post status-publish format-standard has-post-thumbnail hentry category-ho-chi-minh category-quan-11 tag-can-ho" id="post-124753" itemtype="http://schema.org/SingleFamilyResidence" itemscope="">

                                        <div class="post-left">
                                            <div class="post-thumb-wrapper">
                                                <div class="post-thumb" style="background: center no-repeat; background-size: cover;">
                                                    <img src="<%=phongTro.getImage()%>" />
                                                    <a title="<%=phongTro.getTitle()%>" class="post-link" href="chitiet.jsp?phongTroID=<%=phongTro.getId()%>" alt="<%=phongTro.getTitle()%>"></a>
                                                </div>
                                            </div>
                                            <div class="post_info clearfix">
                                                <a title="<%=phongTro.getTitle()%>" class="post-link" href="chitiet.jsp?phongTroID=<%=phongTro.getId()%>" alt="<%=phongTro.getTitle()%>">
                                                    <span class="post-title"><%=phongTro.getTitle()%></span>
                                                </a>
                                                    <p class="p_content"><%=phongTro.getSubContent()%></p>
                                                <div class="p_content_2">
                                                    <div class="p_content_left">
                                                        <span class="post-meta address">Khu vực: <strong><a title="<%=phongTro.getArea()%>" href="https://phongtro123.com/tinh-thanh/ho-chi-minh/quan-11"><%=phongTro.getArea()%></a></strong></span>
                                                        <!--span class="post-meta address">Khu vực: <strong>Quận 11, Hồ Chí Minh</strong></span-->
                                                        <span class="post-meta price">Giá: <strong><%=phongTro.getPrice()%>/tháng</strong></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    
                                    <% } %>
                                    
                                </ul>
                                <!-- / Danh sách tin -->
                            </div>
                            <!-- / wrapper -->
                            <div class="clearfix">
                                <div class="page_navigation">
                                    <div class="custom-pagination">
                                        <% for(int i=1; i<= (total/3) + 1; i++) { %>
                                            <% if (i == pages){ %>
                                                <span class="page-numbers current"><span class="paging"><%=i%></span></span>
                                            <% }else { %>
                                                <a class="page-numbers" href="index.jsp?pages=<%=i%>&area=<%=area%>&priceRange=<%=priceRange%>"><span class="paging"><%=i%></span></a>
                                            <%}
                                        }%>

                                        <a class="next page-numbers" href="index.jsp?pages=<%=(pages +1)%>">Trang tiếp</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- / Main content -->
                <div class="hidden-xs">
                </div>
                <div class="search_box_mobile hidden-lg hidden-sm">
                    <div class="container">
                        <div id="searchbar">
                            <form class="searchform" id="searchformTop" role="search" action="https://phongtro123.com/tim-kiem" method="GET">
                                <div class="search_title">Lọc tin nhanh</div>
                                <div class="search_field">
                                    <div class="clearfix">
                                       
                                        <div class="search_field_item search_field_item_quanhuyen">
                                            <label class="search_field_item_label">Quận huyện</label>
                                            <select name="quan" tabindex="-1" class="form-control js_select2_quanhuyen select2-hidden-accessible" aria-hidden="true" data-current="">
                                                <option value="0">Tất cả</option>
                                            </select>
                                            <span class="select2 select2-container select2-container--default" style="width: 100px;" dir="ltr"><span class="selection"><span tabindex="0" class="select2-selection select2-selection--single" role="combobox" aria-expanded="false" aria-haspopup="true" aria-labelledby="select2-quan-64-container"><span title="Tất cả" class="select2-selection__rendered" id="select2-quan-64-container">Tất cả</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                                        </div>
                                        <div class="search_field_item search_field_item_duongpho">
                                            <label class="search_field_item_label">Đường phố</label>
                                            <select name="duong" tabindex="-1" class="form-control js_select2_duongpho select2-hidden-accessible" aria-hidden="true" data-current="">
                                                <option value="0">Tất cả</option>
                                            </select>
                                            <span class="select2 select2-container select2-container--default" style="width: 100px;" dir="ltr"><span class="selection"><span tabindex="0" class="select2-selection select2-selection--single" role="combobox" aria-expanded="false" aria-haspopup="true" aria-labelledby="select2-duong-5u-container"><span title="Tất cả" class="select2-selection__rendered" id="select2-duong-5u-container">Tất cả</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                                        </div>
                                        <div class="search_field_item search_field_item_mucgia">
                                            <label class="search_field_item_label">Khoảng giá</label>
                                            <select name="price" tabindex="-1" class="form-control price js_select2_price select2-hidden-accessible" aria-hidden="true">
                                                <option selected="selected" value="0">Chọn mức giá</option>
                                                <option value="1">Dưới 1 triệu</option>
                                                <option value="2">1 triệu - 2 triệu</option>
                                                <option value="3">2 triệu - 3 triệu</option>
                                                <option value="4">3 triệu - 5 triệu</option>
                                                <option value="5">5 triệu - 7 triệu</option>
                                                <option value="6">7 triệu - 10 triệu</option>
                                                <option value="7">10 triệu - 15 triệu</option>
                                                <option value="8">Trên 15 triệu</option>
                                            </select>
                                            <span class="select2 select2-container select2-container--default" style="width: 100px;" dir="ltr"><span class="selection"><span tabindex="0" class="select2-selection select2-selection--single" role="combobox" aria-expanded="false" aria-haspopup="true" aria-labelledby="select2-price-xs-container"><span title="Chọn mức giá" class="select2-selection__rendered" id="select2-price-xs-container">Chọn mức giá</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                                        </div>
                                        <div class="search_field_item search_field_item_dientich">
                                            <label class="search_field_item_label">Diện tích</label>
                                            <select name="dientich" tabindex="-1" class="form-control js_select2_acreage select2-hidden-accessible" id="search_dientich" aria-hidden="true">
                                                <option selected="selected" value="0">Chọn diện tích</option>
                                                <option value="1">Dưới 20 m2</option>
                                                <option value="2">20 m2 - 30 m2</option>
                                                <option value="3">30 m2 - 50 m2</option>
                                                <option value="4"> 50 - 60 m2</option>
                                                <option value="5"> 60 - 70 m2</option>
                                                <option value="6"> 70 - 80 m2</option>
                                                <option value="7"> 80 - 90 m2</option>
                                                <option value="8"> 90 - 100 m2</option>
                                                <option value="9"> Trên 100 m2</option>
                                            </select>
                                            <span class="select2 select2-container select2-container--default" style="width: 100px;" dir="ltr"><span class="selection"><span tabindex="0" class="select2-selection select2-selection--single" role="combobox" aria-expanded="false" aria-haspopup="true" aria-labelledby="select2-search_dientich-container"><span title="Chọn diện tích" class="select2-selection__rendered" id="select2-search_dientich-container">Chọn diện tích</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                                        </div>
                                        <div class="search_field_item search_field_item_submit">
                                            <label class="search_field_item_label">&nbsp;</label>
                                            <button class="btn btn-default btn_search_box" type="submit"><i class="fa fa-filter" aria-hidden="true" ></i> Lọc tin</button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
            <div tabindex="-1" class="modal modal_thongbao fade b" id="modal_thongbao" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button class="close" aria-label="Close" type="button" data-dismiss="modal"><span aria-hidden="true">×</span></button>
                            <h4 class="modal-title">Thông báo</h4>
                        </div>
                        <div class="modal-body">
                            <p>Nội dung thông báo</p>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-default" type="button" data-dismiss="modal">Đóng</button>
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>
            <div class="scrollToTop" style="display: none;">Scroll To Top</div>
            <div class="show_desktop">
            </div>
            <div class="zs" id="app"></div>
        </div>



        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/jquery-1.12.0.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/jquery.sticky.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/bootstrap.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/clipboard.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/jquery.bxslider.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/jquery.flexslider-min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/mobile-detect.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/jquery.mmenu.all.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/toastr.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/select2.full.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/jquery.validate.js" type="text/javascript"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/cleave.min.js" type="text/javascript"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/dmuploader.min.js"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/main-updated.js?v=101"></script>
        <script src="https://phongtro123.com/wp-content/themes/phongtro123/js/user_event_tracking.js?v=101"></script>
        <script src="https://phongtro123.com/cdn/js/province.1.0.15.js"></script>
        <script src="https://phongtro123.com/cdn/js/province.1.15.40.js"></script>
        <script src="https://phongtro123.com/cdn/js/province1.40.end.js?v=2"></script>

        <div class="mm-slideout" id="mm-blocker"></div>



    </body></html>