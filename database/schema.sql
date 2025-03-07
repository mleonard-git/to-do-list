CREATE DATABASE todo_list;
USE todo_list;

CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,  -- Unique identifier for each task
    title VARCHAR(255) NOT NULL,        -- Task title
    description TEXT,                   -- Task description
    status ENUM('pending', 'in progress', 'completed') NOT NULL DEFAULT 'pending' -- Task status
);