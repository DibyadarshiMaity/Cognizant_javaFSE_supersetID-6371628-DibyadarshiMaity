import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  const status = cohort.currentStatus.toLowerCase();

  // Blue if Scheduled, Green if Ongoing, Default fallback color
  const headingStyle = {
    color: status === 'ongoing' ? 'green' : 'blue',
    fontWeight: 'bold'
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>
        {cohort.cohortCode} - <span>{cohort.technology}</span>
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
