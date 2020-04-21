<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab5 tabelka</title>
    </head>
    <body>
        
        Licznik wyświetleń strony: ${sessionScope.wyswietlenia} <br>
        <h1>SPIS STUDENTÓW</h1>
        <table style="width:100%" border="solid red">
            <tr>
                <th>Imię</th>
                <th>Nazwisko</th>
                <th>Email</th>
            </tr>
            
            <c:forEach items="${spis}" var="dane_osobowe">
                <tr>
                    <td>
                        ${dane_osobowe.firstName}
                    </td>
                    <td>
                        ${dane_osobowe.lastName}
                    </td>
                    <td>
                        ${dane_osobowe.email}
                    </td>
                </tr>
            </c:forEach>
        </table>
        <form action='/lab5/studentList' method='post'>
            Wpisz dane studenta:
            <p>Imie: <input type='text' name='imie'>
            <p>Nazwisko: <input type='text' name='nazwisko'>
            <p>Email: <input type='text' name='email'>
            <p><input type='submit'></p>
        </form>
    </body>
</html>