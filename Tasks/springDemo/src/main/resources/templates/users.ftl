<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Логин</th>
        </tr>
    <#list users as user>
        <tr>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.login}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>