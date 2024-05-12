<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire Delta</title>
</head>
<body>
    <form action="http://localhost:8080/HelloJEE_war_exploded/resolution" method="get">
        <fieldset>
            <legend>Resolution Equation 2eme Degre</legend>
            <table>
                <tr>
                    <td>
                        <label for='a'>a :</label>
                    </td>
                    <td>
                        <input type="number" name="a" id="a"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for='b'>b :</label>
                    </td>
                    <td>
                        <input type="number" name="b" id="b"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for='c'>c :</label>
                    </td>
                    <td>
                        <input type="number" name="c" id="c"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="reset" value="Annuler"/>
                        <input type="submit" value="Calculer"/>
                    </td>
                </tr>
            </table>
        </fieldset>

    </form>
</body>
</html>
