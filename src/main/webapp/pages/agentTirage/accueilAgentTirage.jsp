<%@ page import="iit.jee.gestionimpressionjee.models.DemandeImpression" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Table with DataTables</title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
</head>
<body>
<h2>Responsive Table with DataTables</h2>

<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <table summary="This table shows how to create responsive tables using Datatables' extended functionality" class="table table-bordered table-hover dt-responsive">
                <caption class="text-center">An example of a responsive table based on <a href="https://datatables.net/extensions/responsive/" target="_blank">DataTables</a>:</caption>
                <thead>
                <tr class="text-white">
                    <th scope="col">Enseignant</th>
                    <th scope="col">Matière</th>
                    <th scope="col">Groupe</th>
                    <th scope="col">Date Impression</th>
                    <th scope="col">Nombre de pages</th>
                    <th scope="col">État</th>

                </tr>
                </thead>
                </thead>
                <tbody>
                <tr>
                    <td>Mohamed Jmal</td>
                    <td>J2EE</td>
                    <td>3</td>
                    <td>09/05/2024</td>
                    <td>23</td>
                    <td>En Attente</td>

                </tr>
                <tr>
                    <td>Said Taktak</td>
                    <td>Java</td>
                    <td>2</td>
                    <td>09/05/2024</td>
                    <td>20</td>
                    <td>Effectué</td>
                </tr>
                <tr>
                    <td>Fatma Ellouz</td>
                    <td>Web</td>
                    <td>1</td>
                    <td>07/05/2024</td>
                    <td>23</td>
                    <td>Effectué</td>
                </tr>
                <tr>
                    <td>Mohamed Jmal</td>
                    <td>J2EE</td>
                    <td>3</td>
                    <td>09/05/2024</td>
                    <td>23</td>
                    <td>En Attente</td>
                </tr>
                <tr>
                    <td>Mohamed Jmal</td>
                    <td>J2EE</td>
                    <td>3</td>
                    <td>09/05/2024</td>
                    <td>23</td>
                    <td>En Attente</td>
                </tr>
                <tr>
                    <td>Mohamed Jmal</td>
                    <td>J2EE</td>
                    <td>3</td>
                    <td>09/05/2024</td>
                    <td>23</td>
                    <td>En Attente</td>
                </tr>
                </tbody>
                <tfoot>
                <tr>
                    <td colspan="5" class="text-center">Data retrieved from <a href="http://www.infoplease.com/ipa/A0855611.html" target="_blank">infoplease</a> and <a href="http://www.worldometers.info/world-population/population-by-country/" target="_blank">worldometers</a>.</td>
                </tr>
                </tfoot>
            </table>
        </div>
    </div>
</div>

<p class="p">Demo by George Martsoukos. <a href="http://www.sitepoint.com/responsive-data-tables-comprehensive-list-solutions" target="_blank">See article</a>.</p>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() {
        $('.table').DataTable();
    });
</script>
</body>
</html>
