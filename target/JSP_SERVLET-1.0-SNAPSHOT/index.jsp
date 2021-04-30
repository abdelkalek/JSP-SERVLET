<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.JSP_SERVLET.CreditModel" %>
<%CreditModel model = (CreditModel) request.getAttribute("mod");%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
    <title>JSP - </title>
</head>

<body>
<div class="container">
    <div class="container-fluid mt-3">
        <form action="controleur" method="POST">
            <div class="row">
                <div class="col-auto">
                    <label for="Montant">Montant</label>
                    <input type="number" class="form-control" id="Montant"  name="montant" value="<%=model.getMontant()%>">
                </div>
            </div>
            <div class="row">
                <div class="col-auto">
                    <label for="inputduree">Duree</label>
                    <input type="number" class="form-control" id="inputduree"  name="duree" value="<%=model.getDuree()%>"/>
                </div>
            </div>
            <div class="row">
                <div class="col-auto">
                    <label>Taux</label>
                    <input type="text" class="form-control" name="taux" value="<%=model.getTaux()%>"  />
                </div>
            </div>

            <div class="col-auto mt-2">
                <button type="submit" class="btn btn-primary mb-3 btn-lg">Calculer</button>
            </div>
        </form>
        <div class="text-center">
            <h2>Mensualite <%=model.getMensualite() %></h2>
        </div>

    </div>
</div>
</body>
</html>