import { TestBed, inject } from '@angular/core/testing';

import { AvisService } from './avis.service';

describe('AvisService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AvisService]
    });
  });

  it('should be created', inject([AvisService], (service: AvisService) => {
    expect(service).toBeTruthy();
  }));
});
