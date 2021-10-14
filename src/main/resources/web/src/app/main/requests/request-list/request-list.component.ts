import {Component, OnInit} from '@angular/core'
import {DomSanitizer} from '@angular/platform-browser'

@Component({
  selector: 'request-list',
  templateUrl: './request-list.component.html',
  styleUrls: ['./request-list.component.css']
})
export class RequestListComponent implements OnInit {

  public videos = [
    {
      title: 'Mold problem in my basement!',
      category: 'De-infestation Treatment',
      url: 'https://www.youtube.com/embed/N7EcNIBlW64',
      seen: true,
      steps: [
        '24 Years old building',
        'I need to fix it immediately',
      ],
      posted: '2 hours ago',
      info: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin id tincidunt dui. Maecenas elementum eros id imperdiet molestie. Vestibulum semper tempus turpis.',
    },
    {
      title: 'Mold problem in my basement!',
      category: 'De-infestation Treatment',
      url: 'https://www.youtube.com/embed/N7EcNIBlW64',
      seen: true,
      steps: [
        '24 Years old building',
        'I need to fix it immediately',
      ],
      posted: '2 hours ago',
      info: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin id tincidunt dui. Maecenas elementum eros id imperdiet molestie. Vestibulum semper tempus turpis.',
    },
    {
      title: 'Mold problem in my basement!',
      category: 'De-infestation Treatment',
      url: 'https://www.youtube.com/embed/N7EcNIBlW64',
      seen: true,
      steps: [
        '24 Years old building',
        'I need to fix it immediately',
      ],
      posted: '2 hours ago',
      info: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin id tincidunt dui. Maecenas elementum eros id imperdiet molestie. Vestibulum semper tempus turpis.',
    },
    {
      title: 'Mold problem in my basement!',
      category: 'De-infestation Treatment',
      url: 'https://www.youtube.com/embed/N7EcNIBlW64',
      seen: true,
      steps: [
        '24 Years old building',
        'I need to fix it immediately',
      ],
      posted: '2 hours ago',
      info: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin id tincidunt dui. Maecenas elementum eros id imperdiet molestie. Vestibulum semper tempus turpis.',
    },
    {
      title: 'Mold problem in my basement!',
      category: 'De-infestation Treatment',
      url: 'https://www.youtube.com/embed/N7EcNIBlW64',
      seen: true,
      steps: [
        '24 Years old building',
        'I need to fix it immediately',
      ],
      posted: '2 hours ago',
      info: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin id tincidunt dui. Maecenas elementum eros id imperdiet molestie. Vestibulum semper tempus turpis.',
    },
  ]

  constructor(private sanitizer: DomSanitizer) {
  }

  ngOnInit(): void {
  }

  getUrl(url) {
    return this.sanitizer.bypassSecurityTrustResourceUrl(url)
  }

  trackByFn(index, row) {
    return row.title
  }

}
