import { TestBed } from '@angular/core/testing';

import { MorningServiceService } from './morning-service.service';

describe('MorningServiceService', () => {
  let service: MorningServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MorningServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
