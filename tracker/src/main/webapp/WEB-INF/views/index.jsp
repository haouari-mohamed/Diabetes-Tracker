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
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="https://via.placeholder.com/30x30" alt="Logo" class="d-inline-block align-text-top me-2">
            Diabetes Awareness
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
                    <a class="nav-link" href="diabete-form.jsp">Add Record</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="list-diabetes.jsp">View Records</a>
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
<div class="container my-5">
    <h1 class="text-center mb-5">Diabetes Articles</h1>
    <div class="row">
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="https://via.placeholder.com/350x200" class="card-img-top" alt="Article Image">
                <div class="card-body">
                    <h5 class="card-title">Understanding Diabetes</h5>
                    <p class="card-text">Learn about the different types of diabetes, their causes, and how to manage them effectively.</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="https://via.placeholder.com/350x200" class="card-img-top" alt="Article Image">
                <div class="card-body">
                    <h5 class="card-title">Healthy Eating for Diabetics</h5>
                    <p class="card-text">Discover the importance of a balanced diet and learn about the best foods for managing diabetes.</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="https://via.placeholder.com/350x200" class="card-img-top" alt="Article Image">
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
    <h2 class="text-center mb-4">Advice Video</h2>
    <div class="ratio ratio-16x9">
        <iframe src="https://www.youtube.com/embed/VIDEO_ID" allowfullscreen></iframe>
    </div>
</div>

<footer>
    <div class="container">
        <p>&copy; 2023 Diabetes Awareness. All rights reserved.</p>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>