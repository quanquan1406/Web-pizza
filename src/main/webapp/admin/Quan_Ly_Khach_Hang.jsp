<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="DAO.KhachhangDAO" %>
<%@ page import="Model.Khachhang" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quản Lý Khách Hàng</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>
    <h1>Danh Sách Khách Hàng</h1>
    
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên Khách Hàng</th>
                <th>Số Điện Thoại</th>
                <th>Địa Chỉ</th>
                <th>Tài Khoản</th>
                <th>Mật Khẩu</th>
            </tr>
        </thead>
        <tbody>
            <% 
                KhachhangDAO KhachhangDAO = new KhachhangDAO();
                List<Khachhang> danhSachKhachhang = KhachhangDAO.getAllKhachhang();
                
                for (Khachhang kh : danhSachKhachhang) {
            %>
                <tr>
                    <td><%= kh.getID_KH() %></td>
                    <td><%= kh.getTen_Khach_Hang() %></td>
                    <td><%= kh.getSo_Dien_Thoai() %></td>
                    <td><%= kh.getDia_Chi() %></td>
                    <td><%= kh.getTai_Khoan() %></td>
                    <td><%= kh.getMat_Khau() %></td>
                </tr>
            <% 
                }
            %>
        </tbody>
    </table>
</body>
</html>
