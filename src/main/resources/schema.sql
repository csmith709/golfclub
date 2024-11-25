CREATE DATABASE golfclub_api;
USE golfclub_api;

-- Create the tournaments table
CREATE TABLE tournaments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    location VARCHAR(255) NOT NULL,
    entry_fee DECIMAL(10, 2) NOT NULL,
    cash_prize DECIMAL(10, 2) NOT NULL
);

-- Insert data into tournaments table
INSERT INTO tournaments (start_date, end_date, location, entry_fee, cash_prize) VALUES
('2024-11-16', '2024-11-18', 'Green Hills Golf Club', 325.00, 25000.00),
('2024-12-01', '2024-12-03', 'Sunnyvale Golf Resort', 400.00, 30000.00),
('2024-12-15', '2024-12-17', 'Oakwood Country Club', 275.00, 20000.00),
('2025-01-10', '2025-01-12', 'Riverside Golf Park', 500.00, 50000.00),
('2025-02-05', '2025-02-07', 'Sunset Valley Golf Club', 350.00, 35000.00),
('2025-03-20', '2025-03-22', 'Mountain View Golf Club', 300.00, 28000.00),
('2025-04-15', '2025-04-17', 'Ocean Breeze Golf Course', 450.00, 40000.00),
('2025-05-10', '2025-05-12', 'Highland Meadows Golf Course', 375.00, 32000.00),
('2025-06-05', '2025-06-07', 'Willow Creek Golf Club', 425.00, 37000.00),
('2025-07-01', '2025-07-03', 'Golden Fields Golf Estate', 525.00, 45000.00);

-- Create the members table
CREATE TABLE members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    start_date DATE NOT NULL,
    duration_in_months INT NOT NULL
);

-- Insert data into members table
INSERT INTO members (name, address, email, phone_number, start_date, duration_in_months) VALUES
('John Doe', '123 Main Street', 'johndoe@example.com', '709-555-1234', '2024-11-20', 12),
('Jane Smith', '456 Oak Avenue', 'janesmith@example.com', '709-555-5678', '2024-11-20', 24),
('Robert Johnson', '789 Pine Road', 'robertjohnson@example.com', '709-555-8765', '2024-11-20', 6),
('Emily Davis', '321 Cedar Lane', 'emilydavis@example.com', '709-555-4321', '2024-12-01', 18),
('Michael Brown', '654 Elm Street', 'michaelbrown@example.com', '709-555-6789', '2024-12-01', 36),
('Jessica Wilson', '987 Birch Boulevard', 'jessicawilson@example.com', '709-555-9876', '2024-12-15', 12),
('David Miller', '741 Maple Drive', 'davidmiller@example.com', '709-555-1478', '2024-12-15', 24),
('Sophia Lee', '852 Walnut Avenue', 'sophialee@example.com', '709-555-2589', '2024-12-20', 6),
('James White', '963 Aspen Place', 'jameswhite@example.com', '709-555-3698', '2025-01-01', 12),
('Linda Harris', '159 Spruce Court', 'lindaharris@example.com', '709-555-9517', '2025-01-10', 18);
