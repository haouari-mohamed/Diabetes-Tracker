<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Diabetes List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
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
        .chart-container {
            width: 100%;
            max-width: 800px;
            margin: auto;
            height: 500px;
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
            <img src="https://i.ibb.co/mBHG1S3/letter-d.png" alt="Logo" class="d-inline-block align-text-top me-2">
            Diabetes Mohamed
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index">Home</a>
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
<div class="container my-5">
    <h2 class="text-center mb-4">Diabetes Performance</h2>
    <div class="d-flex justify-content-end mb-3">
        <a href="showForm" class="btn btn-primary">Add New Record</a>
    </div>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Date</th>
            <th>Time</th>
            <th>Glucose Level</th>
            <th>User ID</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${diabetes}" var="diabete">
            <tr>
                <td>${diabete.id}</td>
                <td>${diabete.date}</td>
                <td>${diabete.time}</td>
                <td>${diabete.glucoseLevel}</td>
                <td>${diabete.user.idDiabete}</td>
                <td>
                    <a href="delete?diabeteId=${diabete.id}" class="btn btn-sm btn-danger">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="chart-container mt-5">
        <canvas id="myChart"></canvas>
    </div>
</div>

<script>
    document.addEventListener('DOMContentLoaded', (event) => {
        const labels = [
            <c:forEach var="gl" items="${diabetes}" varStatus="status">
            "${gl.date}"<c:if test="${!status.last}">,</c:if>
            </c:forEach>
        ];

        const Level = [
            <c:forEach var="gl" items="${diabetes}" varStatus="status">
            ${gl.glucoseLevel}<c:if test="${!status.last}">,</c:if>
            </c:forEach>
        ];

        const data = {
            labels: labels,
            datasets: [
                {
                    label: 'Glucose Level',
                    data: Level,
                    fill: false,
                    borderColor: 'rgb(75, 192, 192)',
                    tension: 0.1
                }
            ]
        };

        const config = {
            type: 'line',
            data: data,
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: {
                        position: 'top',
                    },
                    title: {
                        display: true,
                        text: 'Glucose Levels Over Time'
                    }
                },
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            },
        };

        const ctx = document.getElementById('myChart').getContext('2d');
        new Chart(ctx, config);
    });
</script>
<footer>
    <div class="container">
        <p>&copy; 2023 Diabetes Mohamed Awareness. All rights reserved.</p>
    </div>
</footer>
</body>
</html>