import React, { useEffect, useState } from 'react';
import api from '../../services/api';

const ManageUsers = () => {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    api.get('/admin/users').then(response => {
      setUsers(response.data);
    });
  }, []);

  return (
    <div>
      <h1>Manage Users</h1>
      <ul>
        {users.map(user => (
          <li key={user.id}>{user.username}</li>
        ))}
      </ul>
    </div>
  );
};

export default ManageUsers;
