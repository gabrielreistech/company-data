import { Component, AfterViewInit, ViewChild, ElementRef } from '@angular/core';
import {
  Chart,
  ChartData,
  ChartOptions,
  LineController,
  LineElement,
  PointElement,
  LinearScale,
  CategoryScale,
  Title,
  Filler
} from 'chart.js';

Chart.register(LineController, LineElement, PointElement, LinearScale, CategoryScale, Title, Filler);

@Component({
  selector: 'app-line-chart',
  templateUrl: './line-chart.component.html',
  styleUrls: ['./line-chart.component.css']
})
export class LineChartComponent implements AfterViewInit {
  @ViewChild('myChart') myChart!: ElementRef<HTMLCanvasElement>;

  ngAfterViewInit() {

    const data: ChartData<'line'> = {
      labels: [
        'Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio',
        'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro',
        'Novembro', 'Dezembro'
      ],
      datasets: [
        {
          label: 'Vendas',
          data: [10, 25, 15, 30, 40, 50, 20, 54, 12, 95, 30, 75],
          borderColor: 'red',
          backgroundColor: 'rgba(0,255,255,0.3)',
          fill: true,
          tension: 0.4
        }
      ]
    };

    const options: ChartOptions<'line'> = {
      responsive: true,
      plugins: {
        title: {
          display: true,
          text: 'Gráfico de Vendas Mensais',
          color: 'black',
          font: {
            size: 18,
            weight: 'bold'
          }
        }
      },
      scales: {
        x: {
          ticks: {
            color: 'black',
            font: {
              size: 14,
              weight: 'bold'
            }
          }
        },
        y: {
          ticks: {
            color: 'black',
            font: {
              size: 11
            }
          }
        }
      }
    };

    new Chart(this.myChart.nativeElement, {
      type: 'line',
      data,
      options
    });
  }
}