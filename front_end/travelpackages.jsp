<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Travel Packages | Ghumente Nepal</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50">

  <header class="bg-white shadow p-4 flex justify-between items-center">
    <h1 class="text-2xl font-bold text-green-700">Travel Packages</h1>
    <a href="home" class="text-green-600 hover:underline">← Back to Home</a>
  </header>

  <section class="container mx-auto py-16 px-6">
    <h2 class="text-3xl font-bold text-green-800 mb-8 text-center">Popular Packages</h2>
    <div id="packageList" class="grid md:grid-cols-3 gap-8"></div>
  </section>

  <script>
  async function loadPackages() {
    const res = await fetch('/api/packages');
    const packages = await res.json();
    const container = document.getElementById('packageList');
    container.innerHTML = packages.map(p => `
      <div class="bg-white p-6 rounded shadow hover:shadow-lg transition">
        <img src="${p.imageUrl}" class="w-full h-48 object-cover rounded mb-4">
        <h3 class="font-semibold text-xl mb-2">${p.title}</h3>
        <p class="text-gray-600">${p.price}</p>
      </div>
    `).join('');
  }
  loadPackages();
  </script>

</body>
</html>
