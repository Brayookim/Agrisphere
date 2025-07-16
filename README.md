🌱 Agrisphere
An E-Commerce Agricultural App built to connect farmers, suppliers, and buyers on a single platform. Agrisphere enables seamless transactions, product discovery, and delivery of agricultural goods and services.

🚀 Features
✅ User Authentication – Secure login/signup using email or Google.
✅ Product Listings – Farmers and sellers can post crops, seeds, tools, and more.
✅ Search & Filter – Easily find agricultural products by category or location.
✅ Cart & Checkout – Add items to cart and make secure payments.
✅ Order Tracking – Track delivery status in real-time.
✅ Notifications – Get alerts for new offers, order updates, and more.
✅ Profile Management – Manage personal info and view past orders.

🛠 Tech Stack
Frontend: Flutter (Dart)

Backend: FastAPI (Python)

Database: Firebase Firestore

Authentication: Firebase Auth (Google Sign-In & Email)

Storage: Supabase for media assets

Hosting: GitHub / Firebase Hosting

🔧 Installation
1. Clone the repository
bash
Copy
Edit
git clone https://github.com/Brayookim/Agrisphere.git
cd Agrisphere

2. Install dependencies
For Flutter:

bash
Copy
Edit
flutter pub get

3. Configure Firebase
Create a Firebase project at Firebase Console

Enable Authentication (Email/Google Sign-In)

Create Firestore Database

Download google-services.json and add it to android/app/

4. Run the App
bash
Copy
Edit
flutter run
📚 API Endpoints
Base URL: https://your-fastapi-backend-url.com

Method	Endpoint	Description
POST	/auth/signup	Register a new user
POST	/auth/login	Login user
GET	/products	Get all products
POST	/products	Add new product

🤝 Contributing
Pull requests are welcome! For major changes:

Fork the repo

Create a new branch (feature-branch)

Commit your changes

Submit a pull request

📄 License
This project is licensed.

💡 Future Enhancements
AI-based price prediction

Chat system between farmers and buyers
