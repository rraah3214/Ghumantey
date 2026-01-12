<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Ghumente Nepal</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50">

  <!-- Header -->
  <header class="bg-white shadow">
    <div class="container mx-auto flex justify-between items-center py-4 px-6">
      <div class="flex items-center gap-2">
        <i class="bi bi-globe-asia-australia text-green-600 text-2xl"></i>
        <span class="text-2xl font-bold text-green-700">Ghumente Nepal</span>
      </div>
      <nav class="flex gap-6">
        <a href="guides" class="hover:text-green-600 font-medium">Guides</a>
        <a href="treks" class="hover:text-green-600 font-medium">Treks</a>
        <a href="packages" class="hover:text-green-600 font-medium">Travel Packages</a>
        <a href="hotels" class="hover:text-green-600 font-medium">Hotels</a>
      </nav>
    </div>
  </header>

  <!-- Hero -->
  <section class="bg-gradient-to-r from-green-50 to-green-100 py-16 text-center">
    <h1 class="text-5xl font-bold text-green-800 mb-6">Explore Nepal with <span class="text-green-600">Ghumente</span></h1>
    <p class="text-gray-700 text-lg mb-8">Find the best guides, hotels, treks, and packages — all in one place.</p>
    <a href="packages" class="bg-green-600 text-white px-8 py-3 rounded font-semibold hover:bg-green-700 transition">
      <i class="bi bi-map"></i> Get Started
    </a>
  </section>

  <!-- Footer -->
  <footer class="bg-white border-t mt-12 py-6 text-center text-gray-600">
    &copy; 2026 Ghumente Nepal. All Rights Reserved.
  </footer>

</body>
</html>
