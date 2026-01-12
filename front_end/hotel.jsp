<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Hotels | Ghumente Nepal</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-green-50">

  <header class="bg-white shadow p-4 flex justify-between items-center">
    <h1 class="text-2xl font-bold text-green-700">Hotels</h1>
    <a href="home" class="text-green-600 hover:underline">← Back to Home</a>
  </header>

  <section class="container mx-auto py-16 px-6">
    <h2 class="text-3xl font-bold text-green-800 mb-8 text-center">Recommended Hotels</h2>
    <div id="hotelList" class="grid md:grid-cols-3 gap-8"></div>
  </section>

  <script>
  async function loadHotels() {
    const res = await fetch('/api/hotels');
    const hotels = await res.json();
    const container = document.getElementById('hotelList');
    container.innerHTML = hotels.map(h => `
      <div class="bg-white p-6 rounded shadow hover:shadow-lg transition">
        <img src="${h.imageUrl}" class="w-full h-48 object-cover rounded mb-4">
        <h3 class="font-semibold text-xl mb-2">${h.name}</h3>
        <p class="text-gray-600">${h.location}</p>
      </div>
    `).join('');
  }
  loadHotels();
  </script>

</body>
</html>
