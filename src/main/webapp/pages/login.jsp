<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<form action="Login" method="post" class="needs-validation" novalidate>
    <!-- Username -->
    <div class="mb-3">
        <label for="email" class="form-label">Username</label>
        <input type="text" id="username" name="username" class="form-control" name="email" placeholder="username here" required>
        <div class="invalid-feedback">Please enter valid username.</div>
    </div>
    <!-- Password -->
    <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" id="password" name="password" class="form-control" name="password" placeholder="************" required>
        <div class="invalid-feedback">Please enter valid password.</div>
    </div>


    <div>
        <!-- Button -->
        <div class="d-grid mt-2">
            <button type="submit" value="login" class="btn btn-primary">Sign in</button>
        </div>
    </div>
    <hr class="my-4">

</form>
</div>