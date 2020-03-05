<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Menu</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <a class="navbar-brand" href="/IntiFormation/acceuil">Acceuil</a>
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="/IntiFormation/ajoutformation">Enregistrement <span class="sr-only">Enregistrement</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/IntiFormation/listes">Liste de Formation</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/IntiFormation/listeparlieu">Liste par lieu</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/IntiFormation/newlieu">Ajoutez un Lieu</a>
      </li>
    </ul>
    
    
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

</body>
</html>