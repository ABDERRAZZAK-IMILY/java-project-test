import { Component } from '@angular/core';
import { AuthService } from '../../services/auth';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  form: any = {
    username: null,
    email: null,
    password: null
  };

  constructor(private authService: AuthService) { }

  onSubmit(): void {
    this.authService.register(this.form).subscribe({
      next: data => {
        console.log('register succes!', data);
      },
      error: err => {
        console.error('error:', err);
      }
    });
  }
}
