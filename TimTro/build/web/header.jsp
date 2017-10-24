<%-- 
    Document   : headẻ
    Created on : Sep 18, 2017, 10:36:25 PM
    Author     : nhattruong
--%>

<%@page import="dao.DistrictDAO"%>
<%@page import="model.District"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            DistrictDAO listDistrict = new DistrictDAO();
        %>
        <div class="header">
            <div class="header-top">
                <div class="filter-item">
                    <div class="form-group">
                        <label>Quận/Huyện</label>
                        <select>
                            <%
                                for (District item : listDistrict.getListDistrict()) {
                            %>
                            <option value="<%=item.getValue()%>"><%=item.getName()%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>

                <div class="filter-item filter-price">
                    <div class="form-group">
                        <label>Mức giá</label>
                        <div class="dropdown-price">
                            <input type="number" placeholder="Từ" value="priceFrom" maxlength="7" size="10"> -
                            <input type="number" placeholder="Đến" value="priceTo" maxlength="7" size="10"/>
                        </div>
                    </div>
                </div>

                <div>
                    <div class="form-group">
                        <input type="text" placeholder="Tìm kiếm" value="search" size="20"/>
                        <img src="images/icon-search.png" width="25" height="25"/>Tìm kiếm
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
