import { Component, AfterViewInit, ViewChild, ElementRef } from '@angular/core';
import {
  Chart,
  ChartConfiguration,
  LineController,
  LineElement,
  PointElement,
  LinearScale,
  CategoryScale,
  Title,
  Filler
} from 'chart.js';

// Registrar controllers, elementos e plugins necessários
Chart.register(LineController, LineElement, PointElement, LinearScale, CategoryScale, Title, Filler);

@Component({
  selector: 'app-line-chart',
  templateUrl: './line-chart.component.html',
  styleUrls: ['./line-chart.component.css']
})
export class LineChartComponent implements AfterViewInit {
  @ViewChild('myChart') myChart!: ElementRef<HTMLCanvasElement>;

  ngAfterViewInit() {
    const config: ChartConfiguration<'line'> = {
      type: 'line',
      data: {
        labels: ['Janeiro', 'Fevereiro', 'Março', 'Abril'],
        datasets: [
          {
            label: 'Vendas',
            data: [10, 25, 15, 30],
            borderColor: 'blue',
            backgroundColor: 'rgba(30,144,255,0.3)',
            fill: true,
            tension: 0.4
          }
        ]
      },
      options: {
        responsive: true,
        plugins: {
          title: {
            display: true,
            text: 'Gráfico de Vendas Mensais'
          }
        }
      }
    };

    new Chart(this.myChart.nativeElement, config);
  }
}
