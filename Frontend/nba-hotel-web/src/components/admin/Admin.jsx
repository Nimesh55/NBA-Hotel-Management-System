import React from "react";
import { Link } from "react-router-dom";

const Admin = () => {
  return (
    <div>
      <h2>Welcome to Admin Panel</h2>
      <hr />
      <Link to={"/existing-rooms"}>Manage Rooms</Link>
      <Link to={"/existing-bookings"}>Manage Bookings</Link>
    </div>
  );
};

export default Admin;
