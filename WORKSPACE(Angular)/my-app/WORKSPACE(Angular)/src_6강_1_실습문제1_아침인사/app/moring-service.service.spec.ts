import { TestBed } from '@angular/core/testing';

import { MoringServiceService } from './moring-service.service';

describe('MoringServiceService', () => {
  let service: MoringServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MoringServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
