import React, { useEffect, useState } from 'react';
import api from '../../services/api';

const ManageCategories = () => {
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    api.get('/admin/categories').then(response => {
      setCategories(response.data);
    });
  }, []);

  return (
    <div>
      <h1>Manage Categories</h1>
      <ul>
        {categories.map(category => (
          <li key={category.id}>{category.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default ManageCategories;
