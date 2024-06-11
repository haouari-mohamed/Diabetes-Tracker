<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Diabetes Awareness</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }

        .navbar {
            background-color: #333;
        }

        .navbar-brand,
        .nav-link {
            color: #fff;
        }

        .card-img-top {
            height: 200px;
            object-fit: cover;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        .welcome-section {
            background-color: #f8f9fa;
            padding: 60px 0;
        }

        .welcome-section h1 {
            font-size: 3rem;
            margin-bottom: 20px;
        }

        .welcome-section p {
            font-size: 1.25rem;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">

        <a class="navbar-brand" href="#">
            <img src="https://i.ibb.co/mBHG1S3/letter-d.png" alt="Logo" class="d-inline-block align-text-top me-2">
            Diabetes Mohamed
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="showForm">Add Record</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="list">View Records</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="welcome-section text-center">
    <div class="container">
        <h1>Welcome to Diabetes Awareness</h1>
        <p>Our mission is to educate and support individuals affected by diabetes. <br> Explore our resources, articles, and tips to better understand and manage diabetes.</p>
    </div>
</div>
<div class="container my-5">
    <h1 class="text-center mb-5">Diabetes Articles</h1>
    <div class="row">
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="https://d18yrmqbzi0q7a.cloudfront.net/wp-content/uploads/diabetes-symptoms-and-treatment.jpg" class="card-img-top" alt="Article Image">
                <div class="card-body">
                    <h5 class="card-title">Understanding Diabetes</h5>
                    <p class="card-text">Learn about the different types of diabetes, their causes, and how to manage them effectively.</p>
                    <a href="https://www.who.int/health-topics/diabetes?gad_source=1&gclid=CjwKCAjw65-zBhBkEiwAjrqRMKApn6JUGnMRuLQ5nE9Rf1J03Ua5NLlSCVs5qNF8dYNvJVZOEzJsrhoCn_0QAvD_BwE#tab=tab_1" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="https://www.diabetes.ca/DiabetesCanadaWebsite/media/Managing-My-Diabetes/Picture1.png" class="card-img-top" alt="Article Image">
                <div class="card-body">
                    <h5 class="card-title">Healthy Eating for Diabetics</h5>
                    <p class="card-text">Discover the importance of a balanced diet and learn about the best foods for managing diabetes.</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="https://shelteringarmsinstitute.com/wp-content/uploads/2023/12/Exercising-with-diabetes.jpg" class="card-img-top" alt="Article Image">
                <div class="card-body">
                    <h5 class="card-title">Exercise and Diabetes</h5>
                    <p class="card-text">Explore the benefits of regular exercise for diabetics and get tips on how to incorporate it into your routine.</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container my-5">
    <h2 class="text-center mb-4">Diabetes Tips</h2>
    <div class="ratio ratio-16x9">
        <iframe width="560" height="315" src="https://www.youtube.com/embed/HZH4QASD3ss?si=r34S-ATrbnJIUD4a" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
    </div>
</div>

<footer>
    <div class="container">
        <p>&copy; 2023 Diabetes Mohamed Awareness. All rights reserved.</p>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>