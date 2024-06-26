import React from 'react';
import { Link } from 'react-router-dom';

const AdminDashboard = () => {
  return (
    <div>
      <h1>Admin Dashboard</h1>
      <nav>
        <Link to="/admin/manage-movies">Manage Movies</Link>
        <Link to="/admin/manage-categories">Manage Categories</Link>
        <Link to="/admin/manage-users">Manage Users</Link>
      </nav>
    </div>
  );
};

export default AdminDashboard;
