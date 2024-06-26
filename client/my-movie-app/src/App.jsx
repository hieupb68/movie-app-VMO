import React from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import HomePage from "./pages/HomePage";
import MoviePage from "./pages/MoviePage";
import CategoryPage from "./pages/CategoryPage";
import SearchPage from "./pages/SearchPage";
import AdminDashboard from "./pages/Admin/AdminDashboard";
import Header from "./components/Layout/Header";
import Footer from "./components/Layout/Footer";

function App() {
  return (
    <Router>
      <Header />
      <Switch>
        <Route path="/" exact component={HomePage} />
        <Route path="/movie/:id" component={MoviePage} />
        <Route path="/category/:id" component={CategoryPage} />
        <Route path="/search" component={SearchPage} />
        <Route path="/admin" component={AdminDashboard} />
      </Switch>
      <Footer />
    </Router>
  );
}

export default App;
