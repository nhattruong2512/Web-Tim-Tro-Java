<%@page import="model.PhongTro"%>
<%@page import="dao.PhongTroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en-US"><!--<![endif]--><head>
        <style type="text/css">
            .gm-style .gm-style-mtc label,
            .gm-style .gm-style-mtc div {
                font-weight: 400
            }
        </style>
        <style type="text/css">
            .gm-style .gm-style-cc span,
            .gm-style .gm-style-cc a,
            .gm-style .gm-style-mtc div {
                font-size: 10px
            }
        </style>
        <style type="text/css">
            @media print {
                .gm-style .gmnoprint,
                .gmnoprint {
                    display: none
                }
            }
            @media screen {
                .gm-style .gmnoscreen,
                .gmnoscreen {
                    display: none
                }
            }
        </style>
        <style type="text/css">
            .gm-style-pbc {
                transition: opacity ease-in-out;
                background-color: rgba(0, 0, 0, 0.45);
                text-align: center
            }
            .gm-style-pbt {
                font-size: 22px;
                color: white;
                font-family: Roboto, Arial, sans-serif;
                position: relative;
                margin: 0;
                top: 50%;
                -webkit-transform: translateY(-50%);
                -ms-transform: translateY(-50%);
                transform: translateY(-50%)
            }
        </style>
        <meta name="google-site-verification" content="tSsMrq71kipW3OwGk4GvTRrBIrXc2jGBgt0mCXLEkEA">
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta content="1748349635396853" property="fb:app_id">
        <%
            PhongTroDAO dAO = new PhongTroDAO();
            PhongTro phongTro = new PhongTro();
            int phongTroID = 0;
            if (request.getParameter("phongTroID") != null) {
                phongTroID = Integer.parseInt(request.getParameter("phongTroID"));
                phongTro = dAO.getPhongTroById(phongTroID);
            }
        %>
        <title><%=phongTro.getTitle()%> </title>

        <link href="css/font-awesome.min.css" rel="stylesheet"> 
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/toastr.min.css" rel="stylesheet">
        <link href="css/jquery.bxslider.css" rel="stylesheet">
        <!--<link href="flexslider.css" rel="stylesheet">-->
        <link href="css/select2.min.css" rel="stylesheet"> 
        <link href="css/jquery.mmenu.all.css" rel="stylesheet">
        <link href="css/s1.css" rel="stylesheet">

        <link href="css/fonts.min.css" rel="stylesheet"> 

        <meta name="description" content="Với dạng 2 giường ngủ riêng biệt bạn có thể thoải mái sinh hoạt với từng không gian riêng: Wc rộng rãi Bếp nấu ăn 2…">
        <meta content="Với dạng 2 giường ngủ riêng biệt bạn có thể thoải mái sinh hoạt với từng không gian riêng: Wc rộng rãi Bếp nấu ăn 2…" property="og:description">
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
        
        <style type="text/css">
            .fb_hidden {
                position: absolute;
                top: -10000px;
                z-index: 10001
            }
            .fb_reposition {
                overflow: hidden;
                position: relative
            }
            .fb_invisible {
                display: none
            }
            .fb_reset {
                background: none;
                border: 0;
                border-spacing: 0;
                color: #000;
                cursor: auto;
                direction: ltr;
                font-family: "lucida grande", tahoma, verdana, arial, sans-serif;
                font-size: 11px;
                font-style: normal;
                font-variant: normal;
                font-weight: normal;
                letter-spacing: normal;
                line-height: 1;
                margin: 0;
                overflow: visible;
                padding: 0;
                text-align: left;
                text-decoration: none;
                text-indent: 0;
                text-shadow: none;
                text-transform: none;
                visibility: visible;
                white-space: normal;
                word-spacing: normal
            }
            .fb_reset>div {
                overflow: hidden
            }
            .fb_link img {
                border: none
            }
            @keyframes fb_transform {
                from {
                    opacity: 0;
                    transform: scale(.95)
                }
                to {
                    opacity: 1;
                    transform: scale(1)
                }
            }
            .fb_animate {
                animation: fb_transform .3s forwards
            }
            .fb_shrink_active {
                opacity: 1;
                transform: scale(1, 1);
                transition-duration: 200ms;
                transition-timing-function: ease-out
            }
            .fb_shrink_active:active {
                opacity: .5;
                transform: scale(.75, .75)
            }
            .fb_dialog {
                background: rgba(82, 82, 82, .7);
                position: absolute;
                top: -10000px;
                z-index: 10001
            }
            .fb_reset .fb_dialog_legacy {
                overflow: visible
            }
            .fb_dialog_advanced {
                padding: 10px;
                -moz-border-radius: 8px;
                -webkit-border-radius: 8px;
                border-radius: 8px
            }
            .fb_dialog_content {
                background: #fff;
                color: #333
            }
            .fb_dialog_close_icon {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;
                cursor: pointer;
                display: block;
                height: 15px;
                position: absolute;
                right: 18px;
                top: 17px;
                width: 15px
            }
            .fb_dialog_mobile .fb_dialog_close_icon {
                top: 5px;
                left: 5px;
                right: auto
            }
            .fb_dialog_padding {
                background-color: transparent;
                position: absolute;
                width: 1px;
                z-index: -1
            }
            .fb_dialog_close_icon:hover {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent
            }
            .fb_dialog_close_icon:active {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent
            }
            .fb_dialog_loader {
                background-color: #f6f7f9;
                border: 1px solid #606060;
                font-size: 24px;
                padding: 20px
            }
            .fb_dialog_top_left,
            .fb_dialog_top_right,
            .fb_dialog_bottom_left,
            .fb_dialog_bottom_right {
                height: 10px;
                width: 10px;
                overflow: hidden;
                position: absolute
            }
            .fb_dialog_top_left {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 0;
                left: -10px;
                top: -10px
            }
            .fb_dialog_top_right {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -10px;
                right: -10px;
                top: -10px
            }
            .fb_dialog_bottom_left {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -20px;
                bottom: -10px;
                left: -10px
            }
            .fb_dialog_bottom_right {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -30px;
                right: -10px;
                bottom: -10px
            }
            .fb_dialog_vert_left,
            .fb_dialog_vert_right,
            .fb_dialog_horiz_top,
            .fb_dialog_horiz_bottom {
                position: absolute;
                background: #525252;
                filter: alpha(opacity=70);
                opacity: .7
            }
            .fb_dialog_vert_left,
            .fb_dialog_vert_right {
                width: 10px;
                height: 100%
            }
            .fb_dialog_vert_left {
                margin-left: -10px
            }
            .fb_dialog_vert_right {
                right: 0;
                margin-right: -10px
            }
            .fb_dialog_horiz_top,
            .fb_dialog_horiz_bottom {
                width: 100%;
                height: 10px
            }
            .fb_dialog_horiz_top {
                margin-top: -10px
            }
            .fb_dialog_horiz_bottom {
                bottom: 0;
                margin-bottom: -10px
            }
            .fb_dialog_iframe {
                line-height: 0
            }
            .fb_dialog_content .dialog_title {
                background: #6d84b4;
                border: 1px solid #365899;
                color: #fff;
                font-size: 14px;
                font-weight: bold;
                margin: 0
            }
            .fb_dialog_content .dialog_title>span {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;
                float: left;
                padding: 5px 0 7px 26px
            }
            body.fb_hidden {
                -webkit-transform: none;
                height: 100%;
                margin: 0;
                overflow: visible;
                position: absolute;
                top: -10000px;
                left: 0;
                width: 100%
            }
            .fb_dialog.fb_dialog_mobile.loading {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;
                min-height: 100%;
                min-width: 100%;
                overflow: hidden;
                position: absolute;
                top: 0;
                z-index: 10001
            }
            .fb_dialog.fb_dialog_mobile.loading.centered {
                width: auto;
                height: auto;
                min-height: initial;
                min-width: initial;
                background: none
            }
            .fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner {
                width: 100%
            }
            .fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content {
                background: none
            }
            .loading.centered #fb_dialog_loader_close {
                color: #fff;
                display: block;
                padding-top: 20px;
                clear: both;
                font-size: 18px
            }
            #fb-root #fb_dialog_ipad_overlay {
                background: rgba(0, 0, 0, .45);
                position: absolute;
                bottom: 0;
                left: 0;
                right: 0;
                top: 0;
                width: 100%;
                min-height: 100%;
                z-index: 10000
            }
            #fb-root #fb_dialog_ipad_overlay.hidden {
                display: none
            }
            .fb_dialog.fb_dialog_mobile.loading iframe {
                visibility: hidden
            }
            .fb_dialog_content .dialog_header {
                -webkit-box-shadow: white 0 1px 1px -1px inset;
                background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#738ABA), to(#2C4987));
                border-bottom: 1px solid;
                border-color: #1d4088;
                color: #fff;
                font: 14px Helvetica, sans-serif;
                font-weight: bold;
                text-overflow: ellipsis;
                text-shadow: rgba(0, 30, 84, .296875) 0 -1px 0;
                vertical-align: middle;
                white-space: nowrap
            }
            .fb_dialog_content .dialog_header table {
                -webkit-font-smoothing: subpixel-antialiased;
                height: 43px;
                width: 100%
            }
            .fb_dialog_content .dialog_header td.header_left {
                font-size: 12px;
                padding-left: 5px;
                vertical-align: middle;
                width: 60px
            }
            .fb_dialog_content .dialog_header td.header_right {
                font-size: 12px;
                padding-right: 5px;
                vertical-align: middle;
                width: 60px
            }
            .fb_dialog_content .touchable_button {
                background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#4966A6), color-stop(.5, #355492), to(#2A4887));
                border: 1px solid #29487d;
                -webkit-background-clip: padding-box;
                -webkit-border-radius: 3px;
                -webkit-box-shadow: rgba(0, 0, 0, .117188) 0 1px 1px inset, rgba(255, 255, 255, .167969) 0 1px 0;
                display: inline-block;
                margin-top: 3px;
                max-width: 85px;
                line-height: 18px;
                padding: 4px 12px;
                position: relative
            }
            .fb_dialog_content .dialog_header .touchable_button input {
                border: none;
                background: none;
                color: #fff;
                font: 12px Helvetica, sans-serif;
                font-weight: bold;
                margin: 2px -12px;
                padding: 2px 6px 3px 6px;
                text-shadow: rgba(0, 30, 84, .296875) 0 -1px 0
            }
            .fb_dialog_content .dialog_header .header_center {
                color: #fff;
                font-size: 16px;
                font-weight: bold;
                line-height: 18px;
                text-align: center;
                vertical-align: middle
            }
            .fb_dialog_content .dialog_content {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;
                border: 1px solid #555;
                border-bottom: 0;
                border-top: 0;
                height: 150px
            }
            .fb_dialog_content .dialog_footer {
                background: #f6f7f9;
                border: 1px solid #555;
                border-top-color: #ccc;
                height: 40px
            }
            #fb_dialog_loader_close {
                float: left
            }
            .fb_dialog.fb_dialog_mobile .fb_dialog_close_button {
                text-shadow: rgba(0, 30, 84, .296875) 0 -1px 0
            }
            .fb_dialog.fb_dialog_mobile .fb_dialog_close_icon {
                visibility: hidden
            }
            #fb_dialog_loader_spinner {
                animation: rotateSpinner 1.2s linear infinite;
                background-color: transparent;
                background-image: url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);
                background-repeat: no-repeat;
                background-position: 50% 50%;
                height: 24px;
                width: 24px
            }
            @keyframes rotateSpinner {
                0% {
                    transform: rotate(0deg)
                }
                100% {
                    transform: rotate(360deg)
                }
            }
            .fb_iframe_widget {
                display: inline-block;
                position: relative
            }
            .fb_iframe_widget span {
                display: inline-block;
                position: relative;
                text-align: justify
            }
            .fb_iframe_widget iframe {
                position: absolute
            }
            .fb_iframe_widget_fluid_desktop,
            .fb_iframe_widget_fluid_desktop span,
            .fb_iframe_widget_fluid_desktop iframe {
                max-width: 100%
            }
            .fb_iframe_widget_fluid_desktop iframe {
                min-width: 220px;
                position: relative
            }
            .fb_iframe_widget_lift {
                z-index: 1
            }
            .fb_hide_iframes iframe {
                position: relative;
                left: -10000px
            }
            .fb_iframe_widget_loader {
                position: relative;
                display: inline-block
            }
            .fb_iframe_widget_fluid {
                display: inline
            }
            .fb_iframe_widget_fluid span {
                width: 100%
            }
            .fb_iframe_widget_loader iframe {
                min-height: 32px;
                z-index: 2;
                zoom: 1
            }
            .fb_iframe_widget_loader .FB_Loader {
                background: url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat;
                height: 32px;
                width: 32px;
                margin-left: -16px;
                position: absolute;
                left: 50%;
                z-index: 4
            }
        </style>
        <style type="text/css">
            .gm-style {
                font: 400 11px Roboto, Arial, sans-serif;
                text-decoration: none;
            }
            .gm-style img {
                max-width: none;
            }
        </style>
        <style type="text/css">
            @-webkit-keyframes _gm8041 {
                0% {
                    -webkit-transform: translate3d(0px, -500px, 0);
                    -webkit-animation-timing-function: ease-in;
                }
                50% {
                    -webkit-transform: translate3d(0px, 0px, 0);
                    -webkit-animation-timing-function: ease-out;
                }
                75% {
                    -webkit-transform: translate3d(0px, -20px, 0);
                    -webkit-animation-timing-function: ease-in;
                }
                100% {
                    -webkit-transform: translate3d(0px, 0px, 0);
                    -webkit-animation-timing-function: ease-out;
                }
            }
        </style>
    </head>

    <body class="post-template-default single single-post postid-130647 single-format-standard loaded ready" data-user="0">
        <nav class="mm-menu mm-offcanvas mm-right mm-hasnavbar-top-1 mm-hasnavbar-bottom-1 mm-listview-huge mm-fx-panels-slide-100 mm-fx-listitems-slide mm-fx-menu-slide mm-border-offset" id="mobile_mmenu" aria-hidden="true">
            
        </nav>

        <div class="mm-page mm-slideout" id="mm-0">
            <div class=" fb_reset" id="fb-root">
                <div style="position: absolute; top: -10000px; height: 0px; width: 0px;">
                    <div>

                    </div>
                </div>
                <div style="position: absolute; top: -10000px; height: 0px; width: 0px;">
                    <div></div>
                </div>
            </div>
            <div class="webpage">

                <!-- Header -->
                <header>

                </header>
                <!-- / Header -->

                <div class="show_mobile" id="mobile_navbar">
                    <div class="search_btn_mobile_navbar">
                        <div class="inner"><i class="fa fa-search" aria-hidden="true"></i><span>Tìm kiếm</span>
                        </div>
                    </div>
                </div>

                <div class="breadcrumbs_wrapper">
                    <div class="container">
                        <div class="ad-breadcrumbs">

                        </div>
                        <!-- End.ad-breadcrumbs -->
                        <h1 class="post-title-lg"><%=phongTro.getTitle()%></h1>
                    </div>
                </div>




                <!-- Main content -->
                <div class="container">
                    <div class="page_view_wrapper clearfix">
                        <!-- Left content -->
                        <div>

                            <!-- wrapper -->
                            <div class="wrapper">

                                <!-- Breakcumb -->
                                <!-- / Breakcumb -->

                                <div class="list-post">

                                    <div class="post-130647 post type-post status-publish format-standard has-post-thumbnail hentry category-ho-chi-minh category-quan-10 tag-can-ho" id="post-130647">

                                        <div class="view-detail">

                                            <div class="block-content-1 clearfix">
                                                <div class="block-content-meta">

                                                    <div class="post_summary_wrapper" id="post_summary_wrapper">
                                                        <div class="post_summary clearfix">
                                                            <div class="summary_row clearfix">
                                                                <div class="post_summary_left fullwidth">
                                                                    <div class="summary_item_headline">Địa chỉ:</div>
                                                                    <div class="summary_item_info">
                                                                        <%=phongTro.getAddress()%> </div>
                                                                </div>
                                                            </div>
                                                            <div class="summary_row clearfix">
                                                                <div class="post_summary_left">
                                                                    <div class="summary_item_headline">Email:</div>
                                                                    <div class="summary_item_info">
                                                                        <%=phongTro.getEmail()%> </div>
                                                                </div>
                                                                <div class="post_summary_right">
                                                                    <div class="summary_item_headline">Điện thoại:</div>
                                                                    <div class="summary_item_info summary_item_info_phone">
                                                                        <i class="fa fa-phone" aria-hidden="true"><%=phongTro.getPhone()%></i>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="summary_row clearfix">

                                                                <div class="post_summary_left">
                                                                    <div class="summary_item_headline">Giá cho thuê:</div>
                                                                    <div class="summary_item_info summary_item_info_price">
                                                                        <%=phongTro.getPrice()%> </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>




                                                </div>
                                            </div>

                                            <div class="block-content-2" id="motachitiet">
                                                <span class="block_headline">Thông tin mô tả</span>
                                                <p><%=phongTro.getContent()%>&nbsp;</p>

                                            </div>

                                        </div>
                                    </div>
                                </div>

                            </div>

                            <div class="block-photo" id="hinhanh">
                                <div class="block-photo-title" style="margin: 20px 0; font-size: 16px; font-weight: 600">Hình ảnh</div>

                                <div class="flexslider" id="flexslider_slider">

                                    <div class="flex-viewport" style="overflow: hidden; position: relative;"><ul class="slides" style="width: 200%; transform: translate3d(0px, 0px, 0px); transition-duration: 0s;">

                                            <li class="flex-active-slide" style="width: 672px; margin-right: 0px; display: block; float: left;">
                                                <img title="Cho thuê phòng hoặc nguyên tầng lầu" class="photo_item_image" draggable="false" alt="Cho thuê phòng hoặc nguyên tầng lầu" src="<%=phongTro.getImage()%>">
                                            </li>


                                <div class="flexslider" id="flexslider_carousel">

                                    <div class="flex-viewport" style="overflow: hidden; position: relative;"><ul class="slides" style="width: 200%; transform: translate3d(0px, 0px, 0px); transition-duration: 0s;">
                                            <li class="flex-active-slide" style="width: 85px; margin-right: 5px; display: block; float: left;">
                                                <img title="Cho thuê phòng hoặc nguyên tầng lầu" class="photo_item_image" draggable="false" alt="Cho thuê phòng hoặc nguyên tầng lầu" src="<%=phongTro.getImage()%>">
                                            </li>
                                        </ul></div><ul class="flex-direction-nav"><li class="flex-nav-prev"><a tabindex="-1" class="flex-prev flex-disabled" href="#">Previous</a></li><li class="flex-nav-next"><a tabindex="-1" class="flex-next flex-disabled" href="#">Next</a></li></ul></div>

                            </div>

                        <!-- / Left content -->

                        <!-- Sidebar content -->
                        <div class="block-right" id="sidebar">

                        </div>
                        <!-- / Sidebar content -->

                    </div>
                </div>
                <!-- / Main content -->

                <div class="search_box_mobile hidden-lg hidden-sm">

                    <div class="container">

                    </div>

                    <div class="show_desktop">
                        <div class="keyword">
                            <div class="container">
                                <div>

                                </div>

                            </div>
                        </div>
                    </div>
                    <div tabindex="-1" class="modal modal_thongbao fade b" id="modal_thongbao" role="dialog">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button class="close" aria-label="Close" type="button" data-dismiss="modal"><span aria-hidden="true">×</span>
                                    </button>
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

                <div class="mm-slideout" id="mm-blocker"></div>
                <div class="zs" id="app"></div>
                
                </body></html>