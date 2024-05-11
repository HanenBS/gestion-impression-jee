<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Table with DataTables</title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
</head>
<body>
<h2>Dashboard Agent De Tirage</h2>

<div class="container">
    <div class="row">
        <div class="col-xs-12">
            <table id="demandeTable" class="table table-bordered table-hover dt-responsive">
                <thead>
                <tr class="text-white">
                    <th scope="col">Enseignant</th>
                    <th scope="col">Matiere</th>
                    <th scope="col">Groupe</th>
                    <th scope="col">Date Impression</th>
                    <th scope="col">Nombre de pages</th>
                    <th scope="col">État</th>
                    <th scope="col">Document</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
                <tfoot>

                </tfoot>
            </table>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() {
        $('#demandeTable').DataTable({
            "ajax": {
                "url": "url_de_votre_point_de_terminaison",
                "dataSrc": ""
            },
            "columns": [
                { "data": "enseignant" },
                { "data": "matiere" },
                { "data": "groupe" },
                { "data": "dateImpression" },
                { "data": "nombrePages" },
                { "data": "etat" },
                {
                    "data": null,
                    "render": function(data, type, row) {
                        return "<a href='" + data.document + "'>Document PDF</a>";
                    }
                },
                {
                    "data": null,
                    "render": function(data, type, row) {
                        return "<button onclick='printDocument(\"" + data.document + "\")'>Imprimer</button>";
                    }
                }
            ]
        });
    });

    function printDocument(documentUrl) {
        // Code pour lancer l'impression du document PDF
        console.log("Impression du document: " + documentUrl);
    }
</script>
</body>
</html>
